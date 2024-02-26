//Zad 5 - Rzutować klasę na implementowany interfejs.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        Vehicle vehicle = (Vehicle) car;

        vehicle.wheelReplacement();
        vehicle.addFuel();
        vehicle.drive();
    }
}