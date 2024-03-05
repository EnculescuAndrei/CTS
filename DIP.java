interface Engine{
    public void start();
}

class PetrolEngine implements Engine{
    @Override
    public void start(){};
}

class DieselEngine implements Engine{
    @Override
    public void start(){};
}

class Car1{
    private Engine engine;
    public Car1(Engine e){
        engine=e;
    }
    public void start(){
        engine.start();
    }
}