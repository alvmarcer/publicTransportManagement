package data;

import interfaces.Login;

public class Admin extends Person implements Login {

    String password;

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
