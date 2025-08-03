package Uebung1.Exercise1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int numberToGuess = (int) (Math.random() * 20) + 1;
        Scanner scanner = new Scanner(System.in);
        // Variables that manage the game 's state

        // TODO: Loop until the correct guess or 5 attempts are used
        // Give hints: "Too high", "Too low"
        // Print win/lose message
        int attempts = 0;
while (attempts <5){
int     guess = scanner.nextInt();
    if(guess == numberToGuess){
        System.out.println("You guessed the correct number!");
        break;
    }
    else if (guess < numberToGuess ){
        System.out.println("Nummer zu gering");
        attempts += 1;
    }else if (guess > numberToGuess){
        System.out.println("Nummer zu groß");
        attempts += 1;

    }
}
if (attempts ==5){
    System.out.println("Keine Versuche mehr! Die Zahl war: " + numberToGuess);
}
    }
}