package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        //utworzenie obiektu klasy Car
        Car car = new Car("Audi", "A8", "black", 2023);

        //uzycie metody printCarInformation na obiekcie klasy Car
        car.printCarInformation();
    }
}