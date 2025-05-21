package Homework3.Exercise1differentPackage;

import Homework3.Exercise1.Account;

public class ExternalAudit {
    public void main() {
        Account account = new Account("John", 55.5, 1234, "Broke Boy");
        System.out.println(account.owner); // public - accessible
        System.out.println(account.getBalance()); // private - use getter method
        // System.out.println(account.pin); // protected - not accessible
        // System.out.println(account.internalNote); // default - not accessible
    }
}
