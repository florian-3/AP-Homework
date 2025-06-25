package Uebung8.Exercise1;

public class SUV extends Vehicle {
    private boolean allWheelDrive;

    public SUV(String brand, boolean hasTuv, boolean allWheelDrive) {
        super(brand, hasTuv);
        this.allWheelDrive = allWheelDrive;
    }

    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }
}
