//Zad 1 - Zapoznać się z kodami programów, wykonać je i przetestować
package pl.kriskensy.polimorfizm;

public class Main {
    public static void main(String[] args) {

        Vehicle[] veh = {new Bicycle(), new Motorcycle(), new Car()};
        veh[0].start(); // zostanie wywołana metoda start() dla obiektu Bicycle
        veh[1].start(); // zostanie wywołana metoda start() dla obiektu Motorcycle
        veh[2].start(); // zostanie wywołana metoda start() dla obiektu Car
    }
}