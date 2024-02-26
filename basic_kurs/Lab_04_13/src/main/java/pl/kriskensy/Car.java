package pl.kriskensy;

public class Car {
    private String carBrand;
    private String model;
    private int yearOFProduction;
    private String color;
    private String price = "for free"; //tutaj dodalem pole ze stala wartoscia i zaktualizowalem konstruktor oraz metody

    public Car(String carBrand, String model, int yearOFProduction, String color) {
        this.carBrand = carBrand;
        this.model = model;
        this.yearOFProduction = yearOFProduction;
        this.color = color;
        this.price = price;
    }

    //wyswietlenie zwykla metoda void
    public void printCarInformation() {
        System.out.println("Car brand: " + this.carBrand);
        System.out.println("Model: " + this.model);
        System.out.println("Year of production: " + this.yearOFProduction);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }

    //wyswietlenie metoda toString

    @Override
    public String toString() {
        return carBrand + " " + model + " " + yearOFProduction + " " + color + " price: " + price;
    }
}