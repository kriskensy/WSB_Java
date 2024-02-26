package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wyklad 2");

        Employee e1 = new Employee("kris", "kowalski", 123);
        e1.print();

        OfficeEmployee oe1 = new OfficeEmployee("Basia", "z biura", 5458, "13B");
        oe1.print();
    }
}