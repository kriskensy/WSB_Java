//4 Napis Klase książka w której zadeklarujesz odpowiednie pola, konstruktory nastepnie w metodzie main stworz 5 obiektów,
// a potem dopssz metodę która sprawdza czy książki mają jakieś cechy wspólne, (np czy książki mają tego samego autora)
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Przygody Tomka", "Zenek Martyniuk", "przygodowa", 66);
        Book book2 = new Book("Wielka milosc", "Basia Wielka", "romans", 660);
        Book book3 = new Book("Przygody Antka", "Zenek Martyniuk", "przygodowa", 300);
        Book book4 = new Book("Zgroza", "Pan Kracy", "horror", 99);
        Book book5 = new Book("Przyroda Alaski", "Bibek Malutki", "przyroda", 686);

        System.out.println(book1.sameAuthor(book2));
    }
}