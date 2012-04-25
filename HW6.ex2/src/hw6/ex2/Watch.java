package hw6.ex2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 * Clock builder
 */
public class Watch extends JFrame {
    
    /**
     * Constructor
     */
    public Watch() {
        label = new Label();
        setTitle("Watch");
        setLocation(500,250);
        setSize(350, 180);
        setLayout(new BorderLayout());
        addLabel();
        getData();
        Timer timer = new Timer();
        TimerTask task = new refreshTask();
        timer.schedule(task, 0, 1000);
    }
    
    /**
     * Task that watch should do
     */
    private class refreshTask extends TimerTask {

        @Override
        public void run() {
            getData();
        }
    
    }
    
    /**
     * Edit label style
     */
    private void addLabel() {
        Font font = new Font("Verdana", Font.PLAIN, 65);
        label.setFont(font);
        add(label);
    }
    
    /**
     * Set right data in Label
     */
    private void getData() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String labelText = "";
        if (hour < 10) {
            labelText = labelText.concat("0");
        }
        labelText = labelText.concat(Integer.toString(hour) + " : ");
        
        if (minute < 10) {
            labelText = labelText.concat("0");
        }
        labelText = labelText.concat(Integer.toString(minute) + " : ");
        
        if (second < 10) {
            labelText = labelText.concat("0");
        }
        labelText = labelText.concat(Integer.toString(second));
        
        label.setText(labelText);
    }
    
    private Label label;
}
