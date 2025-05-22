package data;

/**
 * Abstract class that represents a generic vehicle.
 * Contains basic attributes such as ID, ability, cost, model, and brand.
 */
public abstract class Vehicle {
    int id;
    int ability;
    double cost;
    String model;
    String marca;

    /**
     * Constructs a Vehicle with the specified attributes.
     *
     * @param id the unique identifier of the vehicle
     * @param ability the transport capacity of the vehicle
     * @param cost the cost of the vehicle
     * @param model the model of the vehicle
     * @param marca the brand of the vehicle
     */
    public Vehicle(int id, int ability, double cost, String model, String marca){
        this.id = id;
        this.ability = ability;
        this.cost = cost;
        this.model = model;
        this.marca = marca;
    }

    public int getId(){ return id; }
    public int getAbility(){ return ability; }
    public double getCost(){ return cost; }
    public String getModel(){ return model; }
    public String getMarca() { return marca; }

    public void setId(int id) { this.id = id; }
    public void setAbility(int ability) { this.ability = ability; }
    public void setCost(double cost) { this.cost = cost; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModel(String model) { this.model = model; }
}
