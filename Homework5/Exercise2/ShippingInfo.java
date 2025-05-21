package Homework5.Exercise2;

public class ShippingInfo {
    String city;
    int zip;
    String country;



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if (city == null || city.length() == 0){
            throw new InvalidShippingInfoException("City cannot be empty");
        }
        if (zip < 0){
            throw new InvalidShippingInfoException("Zip Code cannot be empty");
        }

        this.city = city;
        this.zip = zip;
        this.country = country;
    }
}
