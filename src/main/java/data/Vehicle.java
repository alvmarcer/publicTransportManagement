package data;

public abstract class Vehicle {
    int id;
    int ability;
    double cost;
    String model;
    String brand;

    public Vehicle(int id, int ability, double cost, String model, String brand){
        this.id = id;
        this.ability = ability;
        this.cost = cost;
        this.model = model;
        this.brand = brand;
    }
    public int getId(){
        return id;
    }
    public int getAbility(){
        return ability;
    }
    public double getCost(){
        return cost;
    }
    public String getmodel(){
        return model;
    }
    public String getmarca() { return brand;}

    public void setId(int id) {this.id = id;}
    public void setAbility(int ability) {this.ability = ability;}
    public void setCost(double cost) {this.cost = cost;}
    public void setMarca(String marca) {this.brand = brand;}
    public void setModel(String model) {this.model = model;}
}
