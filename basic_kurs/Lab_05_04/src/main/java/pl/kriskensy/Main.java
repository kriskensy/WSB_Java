//zad 4 - Stwórz klasę Student z prywatnymi polami (fields) takimi jak imie, nazwisko i numerIndeksu.
//Dodaj odpowiednie gettery i settery dla tych pól. Spróbuj również dodać dodatkową logikę do setterów,
// na przykład sprawdzającą, czy numer indeksu składa się z samych cyfr itp.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Student studentA = new Student("Franek", "Dolas");
        Student studentB = new Student("Robert", "Lewandowski");
        Student studentC = new Student("Wojtek", "Szczesny");

        studentA.setStudentID("123456");
        studentA.printStudentInformations();
        System.out.println();

        studentB.setStudentID("1234567");
        studentB.printStudentInformations();
        System.out.println();

        studentC.setStudentID("jgj454");
        studentC.printStudentInformations();
    }
}