public class Train extends Vehicle implements publicTransport{
    int wagons;
    String stop;

    public Train(int id, int ability,double cost, String model, String marca, int wagons, String stop) {
      super(id, ability, cost, model, marca);
      this.wagons = wagons;
      this.stop = stop;
    }

    public int getWagons(){ return wagons;}

    @Override
    public String getStop() {return stop;}

    @Override
    public void setStop(String stop) {this.stop = stop;}
}
