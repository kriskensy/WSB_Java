package pl.kriskensy;

public class MultiplicationOperation extends Operation {
    @Override
    public void mathOperation() {
        System.out.println("Number a:");
        double a = scanner.nextDouble();
        System.out.println("Number b:");
        double b = scanner.nextDouble();
        System.out.println("Result: " + (a * b));
    }
}