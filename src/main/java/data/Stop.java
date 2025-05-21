package data;

import interfaces.PublicTransport;

import java.util.*;

/**
 * the class represents a public transport stop.
 * It holds an identifier and a list of public transport vehicles that stop here.
 */
public class Stop {
    int id;
    List<PublicTransport> vehicles;

    /**
     * Constructs a Stop with the specified ID.
     *
     * @param id the unique identifier of the stop
     */
    public Stop(int id) {
        this.id = id;
        vehicles = new ArrayList<>();
    }

    /**
     * Adds a public transport vehicle to this stop.
     *
     * @param vehicle the public transport vehicle to add
     */
    public void addVehicle(PublicTransport vehicle) {
        vehicles.add(vehicle);
    }
}
