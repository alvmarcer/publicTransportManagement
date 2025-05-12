package data;

import interfaces.PublicTransport;

import java.util.*;

public class Stop {
    int id;
    List<PublicTransport> vehicles;

    public Stop(int id) {
        this.id = id;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(PublicTransport vehicle) {
        vehicles.add(vehicle);
    }
}
