package hangman;

public class Timer extends Game{
    protected Thread timerThread ;
    protected boolean timerRunning ;
// TODO: Override startGame () to also start the timer
    @Override
    protected void startGame () {
        super.startGame();
        startTimer();
    }
// TODO: Implement startTimer () to create and start the timer thread
    private void startTimer () {
        timerRunning = true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }
}
