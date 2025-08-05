package Uebung4.Exercise2;

public class Truck extends Vehicle implements Refuelable {
    // TODO: add attributes , constants and implement required methods
    protected double fuelLevel;
    public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        fuelLevel = tankCapacity;
// TODO: initialise attributes
    }
// TODO: implement Vehicle + Refuelable methods
    public double getRange(){
            return this.fuelLevel * (1/0.3 + 1%0.3);
    }
    public double fuelNeeded(double distance){
        return distance * 0.3;
    }
    public void refuel (double liters){
        fuelLevel += liters;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    public boolean canReach(double distance) {

            return getRange() >= distance;

    }

}
