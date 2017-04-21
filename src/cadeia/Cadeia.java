/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeia;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Mateus
 */
public class Cadeia {

    Timer timer;

    public Cadeia(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {

        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Cadeia(15);
        System.out.println("Task scheduled.");

    }
}
