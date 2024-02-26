package pl.kriskensy;

public class Product implements Order {

    private String name;
    private double pricePerUnit;
    private int quantity;

    public Product( String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public double priceCalculate() {
        return pricePerUnit * quantity;
    }

    @Override
    public void printInformations() {
        System.out.println("Product: " + name);
        System.out.println("Price per unit: " + pricePerUnit);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price of your products: " + priceCalculate());
    }
}