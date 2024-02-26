//zad 2 - Napisz Aplikacje do zarządzania studentami, dodawanie ich do systemu, wyswietlanie ich, przypisywanie ich do grup,
//oraz dwie dowolne funkcjinalnosci. Wykorzystaj minimum 2 klasy abstrakcyjne, dziedziczenie.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        StudentGroupK grupaK = new StudentGroupK("Grupa K");
        StudentGroupX grupaX = new StudentGroupX("Grupa X");

        Student student1 = new Student("Jas", "Fasola", 1);
        Student student2 = new Student("Zenek", "Bebenek", 2);
        Student student3 = new Student("Pan", "Tadeusz", 3);
        Student student4 = new Student("Anna", "Nowak", 4);
        Student student5 = new Student("Basia", "Jackowska", 5);
        Student student6 = new Student("Kasia", "Kowalska", 6);

        grupaK.addStudent(student1);
        grupaK.addStudent(student3);
        grupaK.addStudent(student5);
        grupaX.addStudent(student2);
        grupaX.addStudent(student4);
        grupaX.addStudent(student6);

        grupaK.displayStudents();
        System.out.println();

        grupaX.displayStudents();
        System.out.println();

        grupaK.setDayOfTheWeek("Saturday");
        grupaX.setDayOfTheWeek("Monday");

        grupaK.showGroupSchedule();
        grupaK.planFinalTest();

        System.out.println();

        grupaX.showGroupSchedule();
        grupaX.planFinalTest();
    }
}