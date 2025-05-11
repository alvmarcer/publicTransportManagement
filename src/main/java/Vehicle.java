public abstract class Vehicle {
    int id;
    int ability;
    double cost;
    String model;
    String marca;

    public Vehicle(int id, int ability, double cost, String model, String marca){
        this.id = id;
        this.ability = ability;
        this.cost = cost;
        this.model = model;
        this.marca = marca;
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
    public String getmarca() { return marca;}

    public void setId(int id) {this.id = id;}
    public void setAbility(int ability) {this.ability = ability;}
    public void setCost(double cost) {this.cost = cost;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModel(String model) {this.model = model;}
}
