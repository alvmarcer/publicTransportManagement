package data;

import interfaces.Login;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a regular user of the system.
 * Inherits personal information from Person and supports login functionality.
 * Users can have a list of trips.
 */
public class User extends Person implements Login {

    double money;
    List<Trip> trips;
    String password;

    /**
     * Creates a new User with the given personal data and password.
     *
     * @param name User's first name
     * @param surname User's last name
     * @param contact User's contact information
     * @param password User's login password
     */

    public User(String name, String surname, String contact, String password){
        super(name,surname,contact);
        money = 0;
        trips = new ArrayList<>();
        this.password = password;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    public void removeMoney(double money) {
        this.money -=money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
