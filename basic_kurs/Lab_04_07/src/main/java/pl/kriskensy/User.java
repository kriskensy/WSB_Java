package pl.kriskensy;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private String surname;
    private int yearOfRegistration;
    private int userID;

    public User(){ } //konstruktor bezparametrowy na potrzeby implementacji metody finalize() poprzez utworzenie i usuniecie wielu obiektow

    public User(String name, String surname, int yearOfRegistration, int userID) {
        this.name = name;
        this.surname = surname;
        this.yearOfRegistration = yearOfRegistration;
        this.userID = userID;
    }

    //standardowe wyswietlanie obiektu
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Year of registration: " + this.yearOfRegistration);
        System.out.println("User ID: " + this.userID);
    }

    //porownanie equals() -> przesloniecie metody. Typy proste mozna przyrownywac bezposrednio, natomiast obiekty przez Objects.equals().
    // W przeslonieciu metody pominalem sprawdzenie czy obiekt nie jest nullem, czy nie jest dokladnie tym samym obiektem
    // oraz czy nalezy do etj samej klasy. Na potrzeby cwiczenia jest to wystarczajace
    @Override
    public boolean equals(Object obj) {
        User anotherUser = (User) obj;
        return Objects.equals(this.name, anotherUser.name)
                && Objects.equals(this.surname, anotherUser.surname)
                && this.yearOfRegistration == anotherUser.yearOfRegistration
                && this.userID == anotherUser.userID;
    }

    //toString() -> przesloniecie metody
    @Override
    public String toString() {
        return "User: " + name + " " + surname + ". Year of registration: " + yearOfRegistration + ". User ID: " + userID;
    }

    //finalize()
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed.");
    }

    //klonowanie obiektu clone() -> przesloniecie metody
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User clonnedObject = (User) super.clone();
        return clonnedObject;
    }
}