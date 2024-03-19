interface Vehicle{
    void assamble();
}
class Motorcycle implements Vehicle{
    String Motocycle;
    public Motorcycle(String motorcycle){
        this.Motocycle=motorcycle;
    }
    @Override
    public void assamble(){
        System.out.println("Assambeling mororcycle: "+Motocycle);
    }
}
class Car implements Vehicle{
    String Car;
    public Car(String car){
        this.Car=car;
    }
    @Override
    public void assamble(){
        System.out.println("Assambeling car: "+Car);
    }
}

interface VehicleFactory{
    Vehicle createVehicle();
}
class CarFactory implements  VehicleFactory{
    String CarFactory;
    public CarFactory(String carFactory){
        this.CarFactory=carFactory;
    }
    @Override
    public Vehicle createVehicle(){
        return new Car(CarFactory);
    }
}
class MotorcycleFactory implements  VehicleFactory{
    String MotorcycleFactory;
    public MotorcycleFactory(String mororcycleFactory){
        this.MotorcycleFactory=mororcycleFactory;
    }
    @Override
    public Vehicle createVehicle(){
        return new Motorcycle(MotorcycleFactory);
    }
}

public class Extra{
    public static void main(String[] args){
        VehicleFactory VehicleFactory1 = new CarFactory("Masina");
        Vehicle vehicle1 = VehicleFactory1.createVehicle();
        vehicle1.assamble();

        VehicleFactory VehicleFactory2 = new MotorcycleFactory("Motocicleta");
        Vehicle vehicle2 = VehicleFactory2.createVehicle();
        vehicle2.assamble();
    }

}