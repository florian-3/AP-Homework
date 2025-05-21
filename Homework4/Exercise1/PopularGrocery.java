package Homework4.Exercise1;

public abstract class PopularGrocery extends GroceryItem{
    int popularityLevel;
    int quantity;

    public PopularGrocery(int popularityLevel) {
        super();
        isPopular = true;
        this.popularityLevel = popularityLevel;
    }

    @Override
    boolean showWarning() {
        return quantity > householdLimit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
