package pl.kriskensy;

//Pracownik biurowy jest pracownikiem, zatem moze dziedziczyc po Pracowniku
public class OfficeEmployee extends Employee {
    private String officeNumber;

    public OfficeEmployee(String name, String surname, int ID, String officeNumber) {
        super(name, surname, ID); //to jest wywolanie konstruktora z klasy Pracownik
        this.officeNumber = officeNumber;
    }

    public void print() {
        //to jest wywolanie metody print z klasy Employee, czyli wydrukowanie imienia, nazwiska i ID pracownika biurowego
        super.print();
        System.out.println("Office number: " + officeNumber);
    }
}