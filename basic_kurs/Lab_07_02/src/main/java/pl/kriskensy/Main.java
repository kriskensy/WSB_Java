//zad 2 - Napisz program w którym użyjesz jednej zmiennej typu private, jedno protected i dwa public, program wypisze
// informacje o kierowcy jego wieku czyli imię, nazwisko, wiek, pesel. Dodaj funkcje wypiszinformacje(), która wypisze
// wszystkie dane na temat kierowcy. Dodaj klasę dziedziczoną Auto: dodaj jeno pole typu private(vin)daj jedno pole typu
// protected(rocznik)dwa pola typu public(marka oraz model)Dodaj funkcje wypiszauto, która wypisze wszystkie dane na temat auta.

//zad 5 - Zmodyfikuj program z zadania 2, dodaj metody pozwalające na zapis informacji o kierowcy i aucie do pliku tekstowego.
package pl.kriskensy;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("00256874825", "Pasikonik", "Jas", 22);
        Car car = new Car("WGGDFHSG8W5461461", 2023, "Audi", "A8");

        System.out.println(driver.toString());
        System.out.println(car.toString());

        WriteToFile.writeToFile(car);
        WriteToFile.writeToFile(driver);
    }
}