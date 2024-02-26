package pl.kriskensy;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductCategory {
    protected List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInfo() {
        for (Product product : products) {
            product.displayInfo();
        }
    }
}