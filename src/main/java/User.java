public class User extends Person{

    Trip trips;

    public User(String dni, String name, String surname, String contact, Trip trips){
        super(dni,name,surname,contact);
        this.trips = trips;
    }

    public Trip getTrips(){
        return trips;
    }

    public void setTrips(Trip trips){
        this.trips = trips;
    }

    @Override
    public String toString(){
        return super.toString() + " " + trips;
    }
}
