package pl.kriskensy;

public class Student extends Person {
    private int studentID;

    public Student(String name, String surname, int studentID) {
        super(name, surname);
        this.studentID = studentID;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " " + surname + ", student ID: " + studentID);
    }
}