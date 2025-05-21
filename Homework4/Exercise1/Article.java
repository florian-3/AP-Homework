package Homework4.Exercise1;

public abstract class Article {
    int discountThreshold;
    int householdLimit;

    abstract int getBulkDiscount();
    abstract boolean showWarning();
}
