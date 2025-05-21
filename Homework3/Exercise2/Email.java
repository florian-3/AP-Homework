package Homework3.Exercise2;

public class Email extends Message{

    @Override
    public String getType(){
        return "Email";
    }
    public void send(){
        System.out.println("Email sent");
    }
}
