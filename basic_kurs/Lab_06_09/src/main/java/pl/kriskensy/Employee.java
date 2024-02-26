package pl.kriskensy;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private double paycheck;

    public Employee(String name, String surname, String position, double paycheck) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.paycheck = paycheck;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public double getPaycheck() {
        return paycheck;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + "\n" + "Position: " + position + ", Paycheck: " + paycheck;
    }
}