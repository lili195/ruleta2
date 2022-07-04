package testRoulette;

import java.util.Timer;
import java.util.TimerTask;


/**
 * ESTO ES PARA PROBAR EL TIMING HAY QUE BORRARLO CUANDO SE TERMINE
 */
public class RepeatedTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("Stop Watch Started.");
        timer.scheduleAtFixedRate(new RepeatedTask(), 500, 1000);
    }

    static class RepeatedTask extends TimerTask {
        public void run() {
            System.out.println("Running!");
        }
    }
}
