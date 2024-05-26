package pl.kriskensy;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String a[]) {

        Calendar meetingDate = Calendar.getInstance();
        meetingDate.set(2024, 2, 16);

        System.out.println("Next meeting date: " + meetingDate.get(Calendar.DAY_OF_MONTH)
                + "." + (meetingDate.get(Calendar.MONTH) + 1) + "." + meetingDate.get(Calendar.YEAR));
    }
}