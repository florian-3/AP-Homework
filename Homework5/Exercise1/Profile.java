package Homework5.Exercise1;

public class Profile {
    ShippingInfo shippingInfo;



    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public Profile(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
