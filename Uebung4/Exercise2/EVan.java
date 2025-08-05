package Uebung4.Exercise2;

public class EVan extends Vehicle implements Electrified {
    // TODO: add attributes , constants and implement required methods
    protected double batteryLevel;
    public EVan(String id, double maxLoad, double batteryCapacity) {
        super(id, maxLoad);
        this.batteryLevel = batteryCapacity;
// TODO: initialise attributes
    }
// TODO: implement Vehicle + Electrified methods

    public double getRange(){
        return this.batteryLevel * 4;
    }
    public double fuelNeeded(double distance){
        return distance * 0.25;
    }
    public void charge (double kWh){
        batteryLevel += kWh;
    }
    public double getBatteryLevel(){
        return batteryLevel;
    }
    public boolean canReach(double distance) {

        return getRange() >= distance;

    }
}
