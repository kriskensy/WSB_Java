package pl.kriskensy;

public class HardwareProduct extends BasicProduct {
    private String brand;

    public HardwareProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}