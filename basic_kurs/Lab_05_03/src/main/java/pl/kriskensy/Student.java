package pl.kriskensy;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private ArrayList<Integer> grades;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grades = new ArrayList<>();
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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    public double gradesAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum / grades.size();
    }

    public void printStudentInformations() {
        System.out.println("name: " + this.name);
        System.out.println("surname: " + this.surname);
        System.out.println("grades average: " + gradesAverage());
    }
}