package pl.kriskensy;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("You cannot divide by zero!");
        }
    }

    public int pow(int a, int b){
        return (int) Math.pow(a, b);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("You cannot divide by zero!");
        }
    }

    public double pow(double a, double b){
        return Math.pow(a, b);
    }
}