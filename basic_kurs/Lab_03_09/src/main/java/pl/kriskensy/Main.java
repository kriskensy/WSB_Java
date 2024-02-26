//Zad 9 - Przygotować dwie metody zwracające boolean i wyświetlające informacje na ekran,
// wykorzystać obie w instrukcji if z wykorzystaniem operatorów logicznych.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";

        //tutaj przyklad uzycia obu metod
        if (itIsPayday(dayOfTheWeek) && itIsWeekend(dayOfTheWeek)) {
            System.out.println(dayOfTheWeek + " is a payday and a weekend.");
        } else if (itIsPayday(dayOfTheWeek)) {
            System.out.println(dayOfTheWeek + " is a payday but not a weekend.");
        } else if (itIsWeekend(dayOfTheWeek)) {
            System.out.println(dayOfTheWeek + " is a weekend but not a payday.");
        } else {
            System.out.println(dayOfTheWeek + " is not a payday and not a weekend. Go to work!");
        }
    }

    //metoda 1
    private static boolean itIsWeekend(String dayOfTheWeek) {
        return dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday");
    }

    //metoda 2
    private static boolean itIsPayday(String dayOfTheWeek) {
        return dayOfTheWeek.equals("Friday") || dayOfTheWeek.equals("Saturday");
    }
}