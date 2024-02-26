package pl.kriskensy;

public class Student extends Person {
    private int yearOfStudy;

    public Student(String name, String surname, int yearOfStudy) {
        super(name, surname);
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return super.toString() + " His year of study is " + yearOfStudy + ".";
    }
}