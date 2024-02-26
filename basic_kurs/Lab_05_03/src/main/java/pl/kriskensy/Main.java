//zad 3 - Stwórz klasę Uczen, która przechowuje informacje o uczniu, takie jak imie, nazwisko,
//oceny itp. Zastosuj hermetyzację, aby chronić te informacje, a następnie dopisz
//metody do dodawania ocen, obliczania średniej ocen i uzyskania informacji o uczniu
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jacek", "Nowak");

        student.addGrades(4);
        student.addGrades(4);
        student.addGrades(5);
        student.addGrades(5);
        student.addGrades(3);

        student.gradesAverage();

        student.printStudentInformations();
    }
}