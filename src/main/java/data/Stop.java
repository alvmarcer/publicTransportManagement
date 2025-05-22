package data;

import interfaces.PublicTransport;

import java.util.*;

/**
 * the class represents a public transport stop.
 * It holds an identifier and a list of public transport vehicles that stop here.
 */
public class Stop {
    int id;
    String name;

    /**
     * Constructs a Stop with the specified ID.
     *
     * @param id the unique identifier of the stop
     */
    public Stop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
