interface Chair{
    String sitOn();
}
interface Sofa{
    String sitOn();
}
class ModernChair implements Chair{
    @Override
    public String sitOn(){
        return "Sitting on modern chair.";
    }
}
class VictorianChair implements Chair{
    @Override
    public String sitOn(){
        return "Sitting on victorian chair.";
    }
}
class ModernSofa implements Sofa{
    @Override
    public String sitOn(){
        return "Sitting on modern sofa.";
    }
}
class VictorianSofa implements Sofa{
    @Override
    public String sitOn(){
        return "Sitting on victorian sofa.";
    }
}
interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}
class ModernFurnitureFactory implements  FurnitureFactory{
    @Override
    public Chair createChair(){
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
       return new ModernSofa();
    }
}
class VictorianFurnitureFactory implements  FurnitureFactory{
    @Override
    public Chair createChair(){
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class Client{
    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory){
        this.furnitureFactory=furnitureFactory;
    }
    public void useFurniture(){
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.sitOn());
    }
}
public class Ex3 {
    public static void main(String[] args){
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        System.out.println("Client uses modern furniture: ");
        Client client1= new Client(modernFactory);
        client1.useFurniture();

        System.out.println("Client uses victorian furniture: ");
        Client client2= new Client(victorianFactory);
        client1.useFurniture();


    }
}
