package pl.kriskensy;

public class DivisionOperation extends Operation {
    @Override
    public void mathOperation() {
        System.out.println("Number a:");
        double a = scanner.nextDouble();
        System.out.println("Number b:");
        double b = scanner.nextDouble();

        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("ERROR!");
        }
    }
}