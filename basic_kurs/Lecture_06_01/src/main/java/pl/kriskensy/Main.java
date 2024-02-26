package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        System.out.println("przyklad listy: ");
        System.out.println();

        Company company = new Company("ABC");

        Product product1 = new Product("1", "product 1", 100);
        company.GetDataBase().GetSetOfProducts().GetProductList().add(product1);

        Product product2 = new Product("2", "product 2", 200);
        company.GetDataBase().GetSetOfProducts().GetProductList().add(product2);

        Product product3 = new Product("3", "product 3", 300);
        company.GetDataBase().GetSetOfProducts().GetProductList().add(product3);

        company.GetDataBase().GetSetOfProducts().printAll();
    }
}