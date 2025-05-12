package data;

import interfaces.PublicTransport;

public class Train extends Vehicle implements PublicTransport {
    int wagons;
    Stop stop;

    public Train(int id, int ability,double cost, String model, String marca, int wagons, Stop stop) {
      super(id, ability, cost, model, marca);
      this.wagons = wagons;
      this.stop = stop;
    }

    public int getWagons(){ return wagons;}

    @Override
    public Stop getStop() {return stop;}

    @Override
    public void setStop(Stop stop) {this.stop = stop;}
}
