package Homework4.Exercise1;

public class Milk extends PopularGrocery {
    public Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.discountThreshold = discountThreshold;
        this.quantity = quantity;
        this.householdLimit = 20;
    }

    @Override
    int getBulkDiscount() {
        if (quantity >= discountThreshold) return 12;
        else return 0;
    }
}
