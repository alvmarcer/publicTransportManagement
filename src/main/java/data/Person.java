package data;

/**
 * Abstract class representing a person with basic personal information.
 * Used as a base for more specific user types like Admin.
 */

public abstract class Person {
    String name;
    String surname;
    String contact;

    /**
     * Creates a new Person with name, surname, and contact info.
     *
     * @param name Person's first name
     * @param surname Person's last name
     * @param contact Contact information
     */

    public Person(String name, String surname, String contact){
        this.name = name;
        this.surname = surname;
        this.contact = contact;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getContact(){
        return contact;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setContact(String contact){
        this.contact = contact;
    }

    @Override
    public String toString(){
        return name + " " + surname + " " + contact;
    }
}
