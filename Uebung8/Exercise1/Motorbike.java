package Uebung8.Exercise1;

public class Motorbike extends Vehicle{
    private int ps;

    public Motorbike(String brand, boolean hasTuv, int ps) {
        super(brand, hasTuv);
        this.ps = ps;
    }

    public int getPs() {
        return ps;
    }
}
