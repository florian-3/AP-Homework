package Homework3.Exercise1differentPackage;

import Homework3.Exercise1.Account;

public class CompanyAccount extends Account {
    public CompanyAccount(String owner, double balance, int pin, String internalNote) {
        super(owner, balance, pin, internalNote);
    }

    public void main(){
    Account account = new Account("John", 55.5, 1234, "Broke Boy");
    System.out.println(account.owner);
   // System.out.println(balance);
    System.out.println(pin);
   // System.out.println(account.internalNote);
}
}
