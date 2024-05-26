package pl.kriskensy.cwiczeniowiec;

import java.awt.*;
import java.util.Date;

public class MyThread {
    public static void main(String[] args) {

        Thread mouseThread = new Thread(() -> {
            try {
                while (true) {
                    PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                    Point point = pointerInfo.getLocation();
                    int mouseX = point.x, mouseY = point.y;
                    System.out.println("MouseX: " + mouseX + " MouseY: " + mouseY);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            } finally {
                System.out.println("everything was done");
            }
        });

        Thread timeThread = new Thread(() -> {
            while (true) {
                Date currentDate = new Date();
                System.out.println("Current Date: " + currentDate);

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                }
            }
        });

        mouseThread.start();
        timeThread.start();
    }
}