package Homework5.Exercise2;

public class EComController {
    public static void main(String[] args)  {

        try {
        ShippingInfo info = new ShippingInfo("Cologne", 12345, "Germany");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);
        System.out.println(" Shipping to: " +
                customer.getProfile().getShippingInfo().getCity());
        }
        catch (InvalidShippingInfoException e) {
            System.out.println("Invalid shipping Info: " + e.getMessage());
        }
        catch (MissingShippingInfoException e){
            System.out.println("Missing Shipping Info: " + e.getMessage());
        }
        catch (InvalidCustomerException e){
            System.out.println("Invalid Customer Info: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
