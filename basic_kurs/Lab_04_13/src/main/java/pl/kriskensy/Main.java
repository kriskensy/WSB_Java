//Zad 13 - Stwórz klasę Car (Samochód) z dowolnymi polami oraz:
//- utwórz konstruktor, który będzie przyjmować wszystkie te informacje jako parametry
//- dodaj Metodę Wyświetlającą Informacje o Samochodzie,
//- W metodzie main w innej klasie (np. TestCar), utwórz kilka obiektów klasy Car, używając konstruktora i przypisz im różne wartości,
//- Utwórz tablicę obiektów klasy Car i przechowaj w niej kilka samochodów.
// Następnie użyj pętli do iteracji przez tablicę i wyświetl informacje o każdym samochodzie.  Rozszerz klasę Car,
//- dodając dodatkowe pola, takie jak liczba drzwi, pojemność silnika, czy cena. Zaktualizuj konstruktor i metody zgodnie z nowymi polami.
package pl.kriskensy;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A3", 1999, "black");
        Car car2 = new Car("BMW", "M5", 2023, "red");
        Car car3 = new Car("Ford", "Focus", 2020, "blue");
        Car car4 = new Car("Fiat", "Duplo", 2018, "white");
        Car car5 = new Car("Hyundai", "Tucson", 2002, "grey");
        Car car6 = new Car("Opel", "Astra", 2022, "green");
        Car car7 = new Car("Porsche", "Panamera", 2006, "black");
        Car car8 = new Car("Fiat", "126P", 1984, "red");

        Car[] carsCatalog = {car1, car2, car3, car4, car5, car6, car7, car8}; //utworzenie tablicy i dodanie do niej stworzonych obiektow

        //wyswietlenie tablicy w petli
        System.out.println("Cars catalog:");
        for(int i=0;i< carsCatalog.length;i++){
            carsCatalog[i].printCarInformation();
            System.out.println();
        }
        System.out.println();

        //wyswietlenie tablicy metoda toString
        System.out.println("Cars catalog:");
        System.out.println(Arrays.toString(carsCatalog));
        System.out.println();
    }
}