package Uebung8.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Junkyard {


    private final ArrayList<? super Vehicle> destoryedVehicles = new ArrayList<>();
// hier oben ist super ein lower bound -> checke hier garnichts


    //PECS - Producer Extends Consumer Super

    public <T extends Vehicle> void destroyVehicle(T vehicle){
        if (!vehicle.hasTuv()){
            destoryedVehicles.add(vehicle);
            System.out.println("Vehicle " + vehicle + " destroyed");
        }
        else{
            System.out.println("Vehicle " + vehicle + " can't be destroyed because it has TUV");
        }
    }
    public ArrayList<? super Vehicle> getDestoryedVehicles(){
        return destoryedVehicles;
    }

}
