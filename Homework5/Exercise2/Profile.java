package Homework5.Exercise2;

public class Profile {
    ShippingInfo shippingInfo;



    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException("Shipping Info is missing");
        }
        this.shippingInfo = shippingInfo;
    }
}
