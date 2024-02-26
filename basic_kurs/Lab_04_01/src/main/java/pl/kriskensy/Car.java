package pl.kriskensy;

public class Car {
    private String brand;
    private String color;
    private int yearOfProduction;
    private String model;

    //konstruktor domyslny, bezargumentowy
    public Car() {
    }

    //konstruktor z czescia argumentow
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //konstruktor ze wszystkimi argumentami
    public Car(String brand, String color, int yearOfProduction, String model) {
        this.brand = brand;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    //metody wtylko do wyswietlenia, zeby poazac roznice, ktory konstruktor sie wywola
    public void printCar() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Year of production: " + this.yearOfProduction);
    }
}