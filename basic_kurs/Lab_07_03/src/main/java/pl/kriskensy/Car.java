package pl.kriskensy;

public class Car {

    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", model: " + model + ", year of production: " + yearOfProduction;
    }
}