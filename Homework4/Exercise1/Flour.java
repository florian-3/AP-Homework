package Homework4.Exercise1;

public class Flour extends PopularGrocery{
    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.discountThreshold = discountThreshold;
        this.quantity = quantity;
        this.householdLimit = 15;
    }
    @Override
    int getBulkDiscount() {
        if (quantity >= discountThreshold) return 5;
        else return 0;
    }
}
