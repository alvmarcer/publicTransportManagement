package data;

import interfaces.WheeledVehicles;

/**
 * represents a Taxi, which is a type of vehicle and implements wheeled vehicles.
 * Contains information about the number of wheels and the driver.
 */
public class Taxi extends Vehicle implements WheeledVehicles {
    int wheels;
    Driver driver;

    /**
     * Constructs a Taxi with the specified attributes.
     *
     * @param id the unique identifier of the taxi
     * @param ability the transport capacity
     * @param cost the cost of the taxi
     * @param model the model of the taxi
     * @param marca the brand of the taxi
     * @param wheels the number of wheels
     * @param driver the driver assigned to the taxi
     */
    public Taxi(int id, int ability, double cost, String model, String marca, int wheels, Driver driver) {
        super(id, ability, cost, model, marca);
        this.wheels = wheels;
        this.driver = driver;
    }

    public Driver getDriver() { return driver; }

    public void setDriver(Driver driver) { this.driver = driver; }

    @Override
    public int getWheels() { return wheels; }

    @Override
    public void setWheels(int wheels) { this.wheels = wheels; }

    @Override
    public String toString(){return id + " " + driver;}
}
