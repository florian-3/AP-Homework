package Homework5.Exercise3;

public class Calculator {
    public static int divide(int a, int b){
      //  try {
            return a / b;
     //   }
       // catch (ArithmeticException e){
         //   System.out.println("Error: Division by zero");
       //     return 0;
       // }
    }
    //...
    public static void main(String [] args ) {
        try {
            System.out.println(Calculator.divide(3, 0));
        } catch (ArithmeticException e) {
System.out.println("Error: Division by zero");        }
    }
}
