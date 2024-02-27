//Open/Closed Principle (OCP)
interface Calculate{
    double calculateValue();
}
class Car implements Calculate{
    private double value;
    @Override
    public double calculateValue(){
        return value*0.8;
    }
}
class Bike implements Calculate{
    private double value;
    @Override
    public double calculateValue(){
        return value*0.5;
    }
}
