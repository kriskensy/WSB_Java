package pl.kriskensy;

public class OverloadingClass {
    public static void main(String[] args) {

        System.out.println(multi(4, 5));
        System.out.println(multi(4.5, 5.5));
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static double multi(double a, double b) {
        return a * b;
    }
}