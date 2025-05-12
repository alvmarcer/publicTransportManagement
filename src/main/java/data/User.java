package data;

import interfaces.Login;

import java.util.ArrayList;
import java.util.List;

public class User extends Person implements Login {

    List<Trip> trips;
    String password;

    public User(String name, String surname, String contact, String password){
        super(name,surname,contact);
        trips = new ArrayList<>();
        this.password = password;
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> getTrips(){
        return trips;
    }

    public void setTrips(List<Trip> trips){
        this.trips = trips;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return super.toString() + " " + trips;
    }
}
