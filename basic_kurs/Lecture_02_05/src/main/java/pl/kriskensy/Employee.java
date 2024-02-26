package pl.kriskensy;

//Employee jest Person -> moze po Person dziedziczyc
public class Employee extends Person {
    private int ID;

    public Employee(String name, String surname, int ID) {
        super(name,surname); //to jest wywolanie konstruktora z klasy osoba czyli uzupelnienie imienia i nazwiska pracownika
        this.ID = ID;
    }

    public void print() {
        System.out.println("Employee data: ");
        super.print(); //to jest wywolanie metody print z klasy Person, czyli wydrukowanie imienia i nazwiska
        System.out.println("ID: " + ID);
    }
}