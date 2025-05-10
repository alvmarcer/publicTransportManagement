public abstract class Person {

    String dni;
    String name;
    String surname;
    String contact;

    public Person(String dni, String name, String surname, String contact){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.contact = contact;
    }

    public String getName(){
        return name;
    }
    public String getDni(){
        return dni;
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
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setContact(String contact){
        this.contact = contact;
    }

    @Override
    public String toString(){
        return dni + " " + name + " " + surname + " " + contact;
    }
}
