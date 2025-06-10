package hangman;
import javax.swing.*;

public class TimerRunnable implements Runnable{
    private final Timer game;
    public TimerRunnable (Timer game) {
        this.game = game;
    }
    @Override
    public void run () {
// TODO: Implement the countdown loop
// - Decrease timeLeft every second
// - Update the time label using SwingUtilities . invokeLater ()
// - End the game if time runs out
        try {
            while (game.timeLeft > 0 && game.timerRunning) {
                Thread.sleep(1000);
                game.timeLeft--;

                // GUI Update im Event-Dispatch-Thread
                SwingUtilities.invokeLater(game::updateDisplay);
            }

            if (game.timeLeft == 0) {
                SwingUtilities.invokeLater(() -> game.endGame(false));
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}
