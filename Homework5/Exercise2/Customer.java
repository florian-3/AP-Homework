package Homework5.Exercise2;

public class Customer {
    Profile profile;
    int id;

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if (profile == null) {
            throw new InvalidCustomerException("Profile is missing");


        }
        if (id < 0) {
            throw new InvalidCustomerException("ID is negative");
        }
        this.profile = profile;
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
