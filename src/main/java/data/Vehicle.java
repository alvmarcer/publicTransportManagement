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
    String brand;

    /**
     * Constructs a Vehicle with the specified attributes.
     *
     * @param id the unique identifier of the vehicle
     * @param ability the transport capacity of the vehicle
     * @param cost the cost of the vehicle
     * @param model the model of the vehicle
     * @param brand the brand of the vehicle
     */
    public Vehicle(int id, int ability, double cost, String model, String brand){
        this.id = id;
        this.ability = ability;
        this.cost = cost;
        this.model = model;
        this.brand = brand;
    }

    public int getId(){ return id; }
    public int getAbility(){ return ability; }
    public double getCost(){ return cost; }
    public String getModel(){ return model; }
    public String getBrand() { return brand; }

    public void setId(int id) { this.id = id; }
    public void setAbility(int ability) { this.ability = ability; }
    public void setCost(double cost) { this.cost = cost; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
}
