//Zad 11 - Stwórz klasę Osoba zawierającą pola imie i nazwisko. Następnie przesłoń metodę toString w klasie Osoba tak,
//aby zwracała tekstowy opis danej osoby. W kolejnym kroku utwórz podklasę Student, rozszerzającą klasę Osoba.
//Dodaj pole rokStudiow do klasy Student. Przesłoń również metodę toString w klasie Student, aby uwzględniała nowe pole.
//W głównym programie utwórz obiekty klasy Osoba i Student oraz wywołaj na nich metodę toString.
//Sprawdź, czy uzyskujesz odpowiednie opisy dla każdego rodzaju obiektu.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jan", "Kowalski");
        Student student = new Student("Jas", "Wedrowniczek", 3);

        System.out.println(person.toString());
        System.out.println(student.toString());
    }
}