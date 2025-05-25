package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainTest {

    @Test
    void testGetWagons() {
        Stop stop = new Stop(5,"Elx Carrus");
        Train train = new Train(1, 100, 1500.0, "Cercanias", "Renfe", 10, stop);

        assertEquals(10, train.getWagons());
    }

    @Test
    void testSetStop() {
        Stop stop1 = new Stop(4,"Elx Parc");
        Stop stop2 = new Stop(6, "Crevillent");
        Train train = new Train(1, 100, 1500.0, "Cercanias", "Renfe", 10, stop1);

        train.setStop(stop2);
        assertEquals(stop2, train.getStop());
    }
}