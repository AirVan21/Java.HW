package hw10.ex2.network;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Updates local Network
 */
public class Time {
    
    /**
     * Constructor
     */
    public Time(NetWork net) {
        this.localNet = net;

    }

    /**
     * Starts working
     */
    public void start() {
        Timer time = new Timer();
        TimerTask task = new TimerTask() {

            /**
             * Actions to do
             */
            @Override
            public void run() {
                localNet.progress();
                localNet.showNet();
                if (!localNet.hasSafe()) {
                    this.cancel();
                }
            }
        };
        time.schedule(task, 1000, 3000);
    }
    
    /**
     * Current net
     */
    private NetWork localNet;
}
