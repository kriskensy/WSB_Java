package pl.kriskensy;

public class SoftwareProduct extends BasicProduct {
    private String minRequirements;

    public SoftwareProduct(String name, double price, String minRequirements) {
        super(name, price);
        this.minRequirements = minRequirements;
    }

    public String getMinRequirements() {
        return minRequirements;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Minimum requirements: " + minRequirements);
    }
}