package pl.kriskensy;

public abstract class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println(name + " " + surname);
    }

    public abstract double paycheck();

    public void printTransferOrder() {
        System.out.println("Transfer order");
        System.out.println("Name and surname: ");
        print();
        System.out.println("Transfer amount: " + paycheck());
        System.out.println();
    }
}