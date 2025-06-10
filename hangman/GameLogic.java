package hangman;

public interface GameLogic {
    void handelGuess(char guess);
    boolean hasWon();
    void endGame(boolean won);
}
