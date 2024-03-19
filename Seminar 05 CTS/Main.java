
interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound(){System.out.println("Woof woof");}
}

class Cat implements Animal{
    @Override
    public void sound(){System.out.println("UwU");}
}

interface AnimalFactory{
    Animal createAnimal();
}

class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(){
        return new Dog();
    }
}
class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(){
        return new Cat();
    }
}
public class Main {
    public static void main(String[] args){
        AnimalFactory dogFactory=new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.sound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.sound();
    }
}