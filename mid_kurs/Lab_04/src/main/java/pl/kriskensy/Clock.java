package pl.kriskensy;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Clock {
    private JLabel timeField;

    public Clock(JLabel timeField) {
        this.timeField = timeField;
    }

    Thread clockThread = new Thread(() -> {
        try {
            while (true) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date timeNow = new Date();
                String formattedTime = sdf.format(timeNow);
                timeField.setText(formattedTime);
                Thread.sleep(1000);
            }
        } catch (RuntimeException | InterruptedException e) {
            timeField.setText(e.getMessage());
        }
    });
}