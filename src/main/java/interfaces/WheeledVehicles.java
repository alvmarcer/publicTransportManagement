package interfaces;

/**
 * defines the basic behavior of a wheeled vehicle.
 * Allows getting and setting the number of wheels.
 */
public interface WheeledVehicles {

    /**
     * Gets the number of wheels.
     *
     * @return the number of wheels.
     */
    int getWheels();

    /**
     * Sets the number of wheels.
     *
     * @param wheels the number of wheels to set.
     */
    void setWheels(int wheels);
}
