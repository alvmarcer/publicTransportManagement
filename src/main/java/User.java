public class User extends Person implements Login{

    Trip trips;
    String password;

    public User(String dni, String name, String surname, String contact, Trip trips, String password){
        super(dni,name,surname,contact);
        this.trips = trips;
        this.password = password;
    }

    public Trip getTrips(){
        return trips;
    }

    public void setTrips(Trip trips){
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
