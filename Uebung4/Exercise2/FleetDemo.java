package Uebung4.Exercise2;

public class FleetDemo {
    public static void main(String[] args) {
// TODO: create a Truck and an EVan, test methods as described
        Truck truck = new Truck("1", 3500.0, 80);
        EVan evan = new EVan("2", 1500.0, 80);


        System.out.println(truck.canReach(300));
        System.out.println(evan.canReach(300));
        System.out.println(truck.getFuelLevel());
        System.out.println(evan.getBatteryLevel());
        truck.refuel(50);
        evan.charge(50);
        System.out.println(truck.getFuelLevel());
        System.out.println(evan.getBatteryLevel());
        System.out.println(truck.canReach(300));
        System.out.println(evan.canReach(300));


    }
}
