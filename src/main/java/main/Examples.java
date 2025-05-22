package main;

import data.*;
import interfaces.PublicTransport;

import java.util.ArrayList;
import java.util.List;

public class Examples {

    public static Admin CreateBaseAdmin() {
        return new Admin("Admin","","678912345","1234");
    }

    public static Driver CreateBaseDriver() {
        return new Driver("12345678A","Paco","García","678 901 234");
    }

    public static Taxi CreateBaseTaxi() {
        return new Taxi(1,4,4.99,"Corsa","Opel",4,CreateBaseDriver());
    }

    public static List<Stop> CreateBaseStops() {
        List<Stop> stops = new ArrayList<>();
        stops.add(new Stop(1,"Stop 1"));
        stops.add(new Stop(2,"Stop 2"));
        stops.add(new Stop(3,"Stop 3"));
        return stops;
    }

    public static List<PublicTransport> CreateBasePublicTransports() {
        List<PublicTransport> publicTransports = new ArrayList<>();

        publicTransports.add(new Bus(1,30,1.49,"Ibiza","Seat",8,CreateBaseStops().get(0)));
        publicTransports.add(new Bus(2,35,1.99,"Ibiza","Seat",8,CreateBaseStops().get(1)));
        publicTransports.add(new Train(1, 60,2.49,"Train","Vectalia",2,CreateBaseStops().get(1)));
        publicTransports.add(new Train(2, 90,2.99,"Train","Vectalia",3,CreateBaseStops().get(2)));

        return publicTransports;
    }
}
