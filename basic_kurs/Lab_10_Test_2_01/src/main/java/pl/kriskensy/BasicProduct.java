package pl.kriskensy;

public abstract class BasicProduct implements Product {
    protected String name;
    protected double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", price: " + price);
    }
}