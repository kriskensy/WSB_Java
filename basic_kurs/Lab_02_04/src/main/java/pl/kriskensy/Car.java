package pl.kriskensy;

public class Car {
    private String carBrand;
    private String model;
    private String color;
    private int yearOfProduction;

    public Car(String carBrand, String model, String color, int yearOfProduction){
        this.carBrand = carBrand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }
}