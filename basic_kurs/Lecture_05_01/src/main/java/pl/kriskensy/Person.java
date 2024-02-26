package pl.kriskensy;

//jezeli osoba implementuje IObjectWIthContract to zeby nie byla abstrakcyjna musi miec zrealizowane wszystkie
// metody z interfejsu czyli print() oraz paycheck()
//Person nie ma funkcji paycheck() dlatego w dalszym ciagu jest abstrakcyjna (musi miec abstract)
public abstract class Person implements IObjectWithContract {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println(name + " " + surname);
    }
}