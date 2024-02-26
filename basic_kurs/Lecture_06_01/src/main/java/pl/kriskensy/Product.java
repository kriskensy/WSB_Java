package pl.kriskensy;

public class Product {
    private String code;
    private String name;
    private float price;

    public Product(String code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}