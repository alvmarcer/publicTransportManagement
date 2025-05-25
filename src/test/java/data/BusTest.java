package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusTest {

    @Test
    void testImplementsInterfaces() {
        Stop stop = new Stop(1, "Zaragoza");
        Bus bus = new Bus(2, 50, 500.0, "Urban", "Volvo", 6, stop);

        assertEquals(6, bus.getWheels());
        assertEquals(stop, bus.getStop());
    }
}