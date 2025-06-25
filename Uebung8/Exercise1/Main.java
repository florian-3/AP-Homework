package Uebung8.Exercise1;

public class Main {
    public static void main(String[] args) {
        Junkyard junkyard = new Junkyard();

        Vehicle car1 = new Convertible("BMW", false, true);
        Vehicle bike1 = new Motorbike("Yamaha", true, 600);
        Vehicle suv1 = new SUV("Audi", false, true);

        junkyard.destroyVehicle(car1);  // Wird zerstört
        junkyard.destroyVehicle(bike1); // Wird NICHT zerstört
        junkyard.destroyVehicle(suv1);  // Wird zerstört



        // wenn getter vorhanden wäre
        //System.out.println(junksard.getDestoryedVehicles().getFirst(); geht
        //Vehicle recycle = junkyard.getDestoryedVehicles().getFirst(); geht nicht (weil kann jeder beliebige Superklasse sein???)
        //Object  recycle = junkyard.getDestoryedVehicles().getFirst(); geht aber wiederum

    }
}