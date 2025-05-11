public class Bus extends Vehicle implements publicTransport, wheeledVehicles {
    int wheels;
    String stop;

    public Bus(int id, int ability, double cost, String model, String marca, int wheels, String stop) {
        super(id, ability, cost, model, marca);
        this.wheels = wheels;
        this.stop = stop;
    }

    @Override
    public int getWheels() {return wheels;}

    @Override
    public void setWheels(int wheels) {this.wheels = wheels;}

    @Override
    public String getStop() {return stop;}

    @Override
    public void setStop(String stop) {this.stop = stop;}
}