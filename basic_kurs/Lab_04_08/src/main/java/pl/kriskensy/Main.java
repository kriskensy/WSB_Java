//Zad 8 - Stworzyć tablicę typów prostych i odwołać się do jej elementów
//Zad 9 - Stworzyć tablice obiektów i odwołać się do jej elementów
//Zad 10 - Wyszukaj dowolny element z tablicy obiektów
//Zad 11 - Posortuj elementy w tablicy obiektów
package pl.kriskensy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //zad 8
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) { //wypelnienie
            numbers[i] = i;
        }

        System.out.println("element 4 is: " + numbers[3]); //odwolanie
        System.out.println("element 8 is: " + numbers[7]); //odwolanie
        System.out.println();

        //zad 9
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "monday";
        daysOfWeek[1] = "tuesday";
        daysOfWeek[2] = "wednesday";
        daysOfWeek[3] = "thursday";
        daysOfWeek[4] = "friday";
        daysOfWeek[5] = "saturday";
        daysOfWeek[6] = "sunday";

        System.out.println("3rd day of the week is: " + daysOfWeek[2]);
        System.out.println("6th day of the week is: " + daysOfWeek[5]);
        System.out.println();

        //zad 10
        String day = "friday";
        int index = dayToLookFor(daysOfWeek, day); //do indeksu przypisuje wynik wyszukiwania po tablicy.
        // Do metody wrzucam tablice i nazwe obiektu, ktorego szukam
        // a nastepnie go wyswietlam
        if (index != -13) {
            System.out.println("day " + day + " was found under index: " + index);
        } else {
            System.out.println("day " + day + " was not found in the array");
        }
        System.out.println();

        //zad 11 - sposob 1
        Arrays.sort(daysOfWeek);

        for (String element : daysOfWeek) { //wyswietlanie sposob 1
            System.out.println(" " + element);
        }
        System.out.println();

        System.out.println("Sorted array: " + Arrays.toString(daysOfWeek)); //wyswietlanie sposob 2
    }

    //metoda do wyszukiwania dnia tygodnia -> jako argumenty cala tablica oraz obiekt
    public static int dayToLookFor(String[] daysOfWeek, String day) {
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(day)) {
                return i; //jesli dzien znaleziony to zwracam indeks pod ktorym sie on znajduje
            }
        }
        return -13; //jesli dzien nie zostal znaleziony to zwracam jakas wartosc, ktorej nie ma w tablicy
    }
}