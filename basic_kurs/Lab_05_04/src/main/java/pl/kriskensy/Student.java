package pl.kriskensy;

public class Student {
    private String name;
    private String surname;
    private String studentID;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void printStudentInformations() {
        System.out.println("name: " + getName());
        System.out.println("surname: " + getSurname());
        if (studentIDValidator(studentID) == true) {
            System.out.println("Student ID: " + getStudentID());
        } else {
            System.out.println("Student ID is not correct!");
        }
    }

    public boolean studentIDValidator(String studentID) {
        if (studentID.length() == 6 && studentID.matches("\\d+")) {
            return true;
        } else {
            return false;
        }
    }
}