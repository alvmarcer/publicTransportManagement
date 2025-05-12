package data;

import interfaces.WheeledVehicles;

public class Taxi extends Vehicle implements WheeledVehicles {
    int wheels;
    Driver driver;

    public Taxi(int id, int ability, double cost, String model, String marca, int wheels, Driver driver) {
        super(id, ability, cost, model, marca);
        this.wheels = wheels;
        this.driver = driver;
    }
    public Driver getDriver() {return driver;}

    public void setDriver(Driver driver) {this.driver = driver;}

    @Override
    public int getWheels() {return wheels;}

    @Override
    public void setWheels(int wheels) {this.wheels = wheels;}

}