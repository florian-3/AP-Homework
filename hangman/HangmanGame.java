package hangman;

import javax.swing.*;
import java.util.ArrayList;

public abstract class HangmanGame extends GameGUI implements GameLogic, TimerLogic {
    protected Thread timerThread;
    protected boolean timerRunning;

    @Override
    protected void startGame() {
        guessedLetters = new ArrayList<>();
        attemptsLeft = 6;
        timeLeft = 60;
        updateDisplay();
        inputField.setEnabled(true);
        inputField.requestFocus();
        startTimer();
    }

    @Override
    public void processInput() {
        String text = inputField.getText().toLowerCase();
        inputField.setText("");

        if (text.length() != 1 || !Character.isLetter(text.charAt(0))) {
            System.out.println("Please enter exactly one letter.");
            return;
        }

        handleGuess(text.charAt(0));
    }

    @Override
    public void handleGuess(char guess) {
        if (guessedLetters.contains(guess)) {
            System.out.println("Letter already guessed.");
            return;
        }

        guessedLetters.add(guess);

        if (!currentWord.contains(String.valueOf(guess))) {
            attemptsLeft--;
        }

        updateDisplay();

        if (hasWon()) {
            endGame(true);
        } else if (attemptsLeft == 0) {
            endGame(false);
        }
    }

    @Override
    public boolean hasWon() {
        for (char c : currentWord.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void endGame(boolean won) {
        timerRunning = false;

        if (won) {
            System.out.println("You won! Word: " + currentWord);
        } else {
            System.out.println("You lost! Word was: " + currentWord);
        }

        inputField.setEnabled(false);
        System.exit(0);
    }

    @Override
    public void startTimer() {
        timerRunning = true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }
}
