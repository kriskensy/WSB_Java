//Zad 10 - Stwórz interfejs Komunikat z metodą wyswietl, która wyświetla dowolny komunikat. Następnie utwórz obiekt
//anonimowy implementujący ten interfejs i użyj go do wyświetlenia kilku różnych komunikatów.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Announcement announcement = new Announcement() {
            @Override
            public void print(String text) {
                System.out.println("Hello! " + text);
            }
        };

        announcement.print("Today is a sunny day!");
        announcement.print("Today is a raining day!");
        announcement.print("Today is a snowy day!");
    }
}