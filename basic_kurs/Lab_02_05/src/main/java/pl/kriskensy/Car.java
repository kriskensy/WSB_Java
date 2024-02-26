package pl.kriskensy;

public class Car {
    //pola klasy
    private String carBrand;
    private String model;
    private String color;
    private int yearOfProduction;

    //konstruktor
    public Car(String carBrand, String model, String color, int yearOfProduction) {
        this.carBrand = carBrand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    //gettery oraz settery
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    //przykladowa metoda void, wyswietlajaca informacje o utworzonym obiekcie klasy Car
    public void printCarInformation() {
        System.out.println("You have created this car: ");
        System.out.println("Brand: " + getCarBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Year of production: " + yearOfProduction);
    }
}
