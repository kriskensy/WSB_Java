package pl.kriskensy;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentGroup {
    protected String groupName;
    protected List<Student> students = new ArrayList<>();

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("All students in group " + groupName);
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public abstract void showGroupSchedule();

    public abstract void planFinalTest();
}