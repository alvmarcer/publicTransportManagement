package data;

import java.util.Date;

/**
 * represents a trip made by a taxi on a specific date.
 */
public class Trip {
    Taxi taxi;
    Date date;

    /**
     * Constructs a Trip with the specified taxi and date.
     *
     * @param taxi the taxi assigned to the trip
     * @param date the date of the trip
     */
    public Trip(Taxi taxi, Date date){
        this.taxi = taxi;
        this.date = date;
    }

    public Taxi getTaxi(){return taxi;}
    public Date getDate(){return date;}

    public void setTaxi(Taxi taxi){this.taxi = taxi;}
    public void setDate(Date date){this.date = date;}

    /**
     * Returns a string representation of the trip.
     *
     * @return a string with the taxi and the date of the trip
     */
    @Override
    public String toString(){return taxi + " " + date;}
}
