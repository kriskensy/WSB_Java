package pl.kriskensy;

public class Employee extends Person {
    private int ID;

    public Employee(String name, String surname, int ID) {
        super(name,surname);
        this.ID = ID;
    }

    public void print() {
        System.out.println("Employee data: ");
        super.print();
        System.out.println("ID: " + ID);
    }
}