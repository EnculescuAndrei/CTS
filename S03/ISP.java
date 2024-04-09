interface VehicleWDoors{
    public void drive();
    public void stop();
    public void openDoors();
}
interface VehicleWODoors{
    public void drive();
    public void stop();
}

class Bike implements VehicleWODoors{
    public void drive(){}
    public void stop(){};
}

class Car implements VehicleWDoors{
    public void drive(){}
    public void stop(){};
    public void openDoors(){};
}

