//zad 8 - Wykonaj następujące zadania:
//A. Zdefiniuj klasę abstrakcyjną Book, która będzie zawierała informacje o książce. Dodaj również abstrakcyjną metodę displayInfo(),
// która będzie wyświetlać informacje o książce.
//B. Stwórz dwie klasy dziedziczące po klasie Book - FictionBook i NonFictionBook. Dla każdej klasy dodaj konstruktor,
// który przyjmuje odpowiednie parametry i przekazuje je do konstruktora klasy bazowej.
//C. Zdefiniuj klasę BookManager, która będzie zawierała listę książek. Dodaj metody umożliwiające dodawanie nowych książek,
// wyświetlanie informacji o wszystkich książkach oraz zapisywanie informacji o książkach do pliku tekstowego.
//D. W głównej klasie aplikacji , stwórz kilka obiektów klasy FictionBook i NonFictionBook. Dodaj je do obiektu
// BookManager i wyświetl informacje o wszystkich książkach. Następnie zapisz informacje o książkach do pliku tekstowego.
//E. Dodaj funkcjonalność odczytu informacji o książkach z pliku tekstowego do obiektu BookManager. Wyświetl ponownie
// informacje o książkach, aby potwierdzić poprawność odczytu.
package pl.kriskensy;

import pl.kriskensy.book.Book;
import pl.kriskensy.book.BookManager;
import pl.kriskensy.book.FictionBook;
import pl.kriskensy.book.NonFictionBook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        FictionBook fictionBook1 = new FictionBook("Przygody Tomka", "Pan Kracy", 1984);
        FictionBook fictionBook2 = new FictionBook("Kto ty?", "Duzy Dzik", 1999);
        FictionBook fictionBook3 = new FictionBook("Hej ho!", "Pani Ania", 2020);
        FictionBook fictionBook4 = new FictionBook("Na ratunek!", "Wielki Ziom", 2005);
        FictionBook fictionBook5 = new FictionBook("Ach Ty!", "KuKu Leczka", 2015);

        bookManager.addBook(fictionBook1);
        bookManager.addBook(fictionBook2);
        bookManager.addBook(fictionBook3);
        bookManager.addBook(fictionBook4);
        bookManager.addBook(fictionBook5);

        NonFictionBook nonFictionBook1 = new NonFictionBook("Dokad zmierzasz?", "Anna Nowak", 2000);
        NonFictionBook nonFictionBook2 = new NonFictionBook("Co to za zycie?", "Jan Kowalski", 2013);
        NonFictionBook nonFictionBook3 = new NonFictionBook("Byle do wiosny.", "Barbara Jackowska", 2010);
        NonFictionBook nonFictionBook4 = new NonFictionBook("Masz Ci los!", "Antek Pantek", 2009);
        NonFictionBook nonFictionBook5 = new NonFictionBook("Ostatnia ksiazka", "Zdzichu Wiertara", 1988);

        bookManager.addBook(nonFictionBook1);
        bookManager.addBook(nonFictionBook2);
        bookManager.addBook(nonFictionBook3);
        bookManager.addBook(nonFictionBook4);
        bookManager.addBook(nonFictionBook5);

//        bookManager.listBooks(); //tutaj wyswietlenie listy ksiazek do konsoli.

        bookManager.writeBooksInfoToFile();
        bookManager.readBooksFromFile();
    }
}