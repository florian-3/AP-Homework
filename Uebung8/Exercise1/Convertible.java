package Uebung8.Exercise1;

public class Convertible extends Vehicle{
    private boolean roofDown;
    public Convertible(String brand, boolean hasTuv, boolean roofDown) {
        super(brand, hasTuv);
        this.roofDown = roofDown;
    }

    public boolean isRoofDown() {
        return roofDown;
    }
}
