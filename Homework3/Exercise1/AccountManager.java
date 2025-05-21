package Homework3.Exercise1;

public class AccountManager {
    public void main(){
        Account account = new Account("John", 55.5, 1234, "Broke Boy");
        System.out.println(account.owner);
      //  System.out.println(account.balance);
        System.out.println(account.pin);
        System.out.println(account.internalNote);
    }

}
