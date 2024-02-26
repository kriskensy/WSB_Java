package pl.kriskensy;

public class Service implements Order {
    private String description;
    private double pricePerHour;
    private double hours;

    public Service(String description, double pricePerHour, double hours) {
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.hours = hours;
    }

    @Override
    public double priceCalculate() {
        return pricePerHour * hours;
    }

    @Override
    public void printInformations() {
        System.out.println("Service description: " + description);
        System.out.println("Price per hour: " + pricePerHour);
        System.out.println("Ordered hours: " + hours);
        System.out.println("Total price of your services: " + priceCalculate());
    }
}
