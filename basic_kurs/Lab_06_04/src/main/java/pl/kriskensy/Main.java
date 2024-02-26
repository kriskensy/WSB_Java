//Zad 4 - Określić w jaki sposób wykonywane jest własne porównywanie obiektów.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A8", 2000);
        Car car2 = new Car("BWM", "M5", 2023);
        Car car3 = new Car("Audi", "A8", 2000);
        Car car4 = new Car("BWM", "M5", 1999);

        System.out.println("is car1 equals car2? " + car1.equals(car2));
        System.out.println("is car1 equals car3? " + car1.equals(car3));
        System.out.println("is car2 equals car4? " + car1.equals(car4));
    }
}