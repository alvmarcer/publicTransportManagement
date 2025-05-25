package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaxiTest {

    @Test
    void testGetDriver() {

        Driver driver = new Driver("123456789","Pedro", "Lopez","PedritoL");
        Taxi taxi = new Taxi(1, 4, 10.0, "ModelX", "Toyota", 4, driver);

        assertEquals(driver, taxi.getDriver());
    }

    @Test
    void testSetWheels() {
        Taxi taxi = new Taxi(1, 4, 10.0, "ModelX", "Toyota", 4, new Driver("1234567890","Lola","Lolita","Topconductora09"));
        taxi.setWheels(6);

        assertEquals(6, taxi.getWheels());
    }
}