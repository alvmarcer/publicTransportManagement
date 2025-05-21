package data;

import interfaces.PublicTransport;
import interfaces.WheeledVehicles;

/**
 * the class represents a Bus, which is a type of vehicle
 * implementing both PublicTransport and WheeledVehicles interfaces.
 * It contains information about the number of wheels and the stop associated with the bus.
 */
public class Bus extends Vehicle implements PublicTransport, WheeledVehicles {
    int wheels;
    Stop stop;

    /**
     * Constructs a Bus with the specified attributes.
     *
     * @param id the unique identifier of the bus
     * @param ability the transport capacity
     * @param cost the cost of the bus
     * @param model the model of the bus
     * @param marca the brand of the bus
     * @param wheels the number of wheels
     * @param stop the stop associated with the bus
     */
    public Bus(int id, int ability, double cost, String model, String marca, int wheels, Stop stop) {
        super(id, ability, cost, model, marca);
        this.wheels = wheels;
        this.stop = stop;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public Stop getStop() {
        return stop;
    }

    @Override
    public void setStop(Stop stop) {
        this.stop = stop;
    }
}
