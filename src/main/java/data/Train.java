package data;

import interfaces.PublicTransport;

/**
 * srepresents a train, which is a type of vehicle and implements public transport.
 * Includes information about the number of wagons and the stop associated with the train.
 */
public class Train extends Vehicle implements PublicTransport {
    int wagons;
    Stop stop;

    /**
     * Constructs a Train with the specified attributes.
     *
     * @param id the unique identifier of the train
     * @param ability the transport capacity
     * @param cost the cost of the train
     * @param model the model of the train
     * @param marca the brand of the train
     * @param wagons the number of wagons
     * @param stop the stop associated with the train
     */
    public Train(int id, int ability, double cost, String model, String marca, int wagons, Stop stop) {
        super(id, ability, cost, model, marca);
        this.wagons = wagons;
        this.stop = stop;
    }

    public int getWagons() { return wagons; }

    @Override
    public Stop getStop() { return stop; }

    @Override
    public void setStop(Stop stop) { this.stop = stop; }

    @Override
    public String toString() {
        return "Bus: " + id + " " + ability + " " + cost + " " + model + " " + marca + " " + wagons;
    }
}
