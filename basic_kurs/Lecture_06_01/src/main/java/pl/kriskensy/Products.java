//ta klasa bedzie zawierala kolekcje obiektow klasy Product.
//Uzyjemy do przechowywania kolekcji klasy Product; listy
package pl.kriskensy;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> productList;

    public Products() {
        productList = new ArrayList<Product>();
    }

    public List<Product> GetProductList() { //metoda tylko do zwracania pola bo lista jest prywatna
        return productList;
    }

    public void printAll() {
        for (int i = 0; i < productList.size(); i++)
            productList.get(i).print(); //tu pobieram element o indeksie i a nastepnie dla tego elementu
        // wywoluje metode print() z klasy Product
    }
}