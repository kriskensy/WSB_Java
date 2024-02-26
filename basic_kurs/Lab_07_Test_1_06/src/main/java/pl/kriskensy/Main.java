//6 Stwóz klasę którą będzie można wykorzystać w "aplikacji bibliotecznej", zadeklaruj odpowiednie
// pola(minimum 5 i jedno pole typu int), stwóz konstruktory, na podstawie tej klasy stwóz obiekty,
// zapisz obiekty w tablicy obiektów, posortuj tablice obiektów wg dowolnego pola.
package pl.kriskensy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Przygody Tomka", "Zenek Martyniuk", "przygodowa", 66, 1999);
        Book book2 = new Book("Wielka milosc", "Basia Wielka", "romans", 660, 2005);
        Book book3 = new Book("Przygody Antka", "Zenek Martyniuk", "przygodowa", 300, 1987);
        Book book4 = new Book("Zgroza", "Pan Kracy", "horror", 99, 2020);
        Book book5 = new Book("Przyroda Alaski", "Bibek Malutki", "przyroda", 686, 1988);

        Book[] biblio = {book1, book2, book3, book4, book5};

        Arrays.sort(biblio);

        for (Book book : biblio) {
            System.out.println(book);
        }
    }
}