package data;

import interfaces.Login;

/**
 * Represents an admin user. Inherits personal information from Person
 * and implements the Login interface to handle authentication.
 */

public class Admin extends Person implements Login {

    String password;

    /**
     * Creates a new Admin with the given personal data and password.
     *
     * @param name Admin's first name
     * @param surname Admin's last name
     * @param contact Admin's contact information
     * @param password Admin's login password
     */

    public Admin(String name, String surname, String contact, String password){
        super(name,surname,contact);
        this.password = password;
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
        return super.toString();
    }
}
