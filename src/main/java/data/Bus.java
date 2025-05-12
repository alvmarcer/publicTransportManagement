package data;

import interfaces.PublicTransport;
import interfaces.WheeledVehicles;

public class Bus extends Vehicle implements PublicTransport, WheeledVehicles {
    int wheels;
    Stop stop;

    public Bus(int id, int ability, double cost, String model, String marca, int wheels, Stop stop) {
        super(id, ability, cost, model, marca);
        this.wheels = wheels;
        this.stop = stop;
    }

    @Override
    public int getWheels() {return wheels;}

    @Override
    public void setWheels(int wheels) {this.wheels = wheels;}

    @Override
    public Stop getStop() {return stop;}

    @Override
    public void setStop(Stop stop) {this.stop = stop;}
}