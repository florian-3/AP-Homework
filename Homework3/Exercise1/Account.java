package Homework3.Exercise1;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote; //this is default aka package-private access

    public double getBalance(){
        return balance;
    }

    public boolean changePin(int currentPin,int newPin){
        if (currentPin == this.pin){
            this.pin = newPin;
            return true;
        }
        return false;
    }


    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }
}
