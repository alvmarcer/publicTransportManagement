package data;

/**
 * Represents a driver in the system.
 * Inherits personal information from the Person class.
 */



public class Driver extends Person{

    /**
     * Creates a new Driver with the given personal data.
     *
     * @param dni Unused parameter, may be intended for future use
     * @param name Driver's first name
     * @param surname Driver's last name
     * @param contact Driver's contact information
     */

    public Driver(String dni, String name, String surname, String contact){
        super(name,surname,contact);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
