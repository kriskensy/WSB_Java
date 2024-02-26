package pl.kriskensy.przeciazenie;

public class Przyklad {

    // Przeciążanie metody sum
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static String sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3)); // Wyświetli: 5
        System.out.println(sum(2.5, 3.5)); // Wyświetli: 6.0
        System.out.println(sum("Hello, ", "world!")); // Wyświetli: Hello, world!
    }
}