package hw6.ex2;

import javax.swing.JFrame;

/**
 * Clock program
 * @author AirVan
 */
public class HW6Ex2 {

    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        watch.setVisible(true);
    }
}
