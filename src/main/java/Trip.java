import java.util.Date;

public class Trip {

    Taxi taxi;
    Date date;

    public Trip(Taxi taxi, Date date){
        this.taxi = taxi;
        this.date = date;
    }

    public Taxi getTaxi(){
        return taxi;
    }
    public Date getDate(){
        return date;
    }

    public void getTaxi(Taxi taxi){
        this.taxi = taxi;
    }
    public void getDate(Date date){
        this.date = date;
    }

    @Override
    public String toString(){
        return taxi + " " + date;
    }
}
