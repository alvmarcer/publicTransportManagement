package data;

public abstract class Person {
    String name;
    String surname;
    String contact;

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
