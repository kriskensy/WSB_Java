//zad 1 - Napisz program do zarządzania produktami w sklepie. Wykorzystując obiektowość stwóz schemat na dodawanie
//nowego produktu z różnych kategorii. Dodaj kilka różnych produktów. Stwóz mechanizm do zarządzania produktami.
//(wykorzystaj minimum 2 klasy abstracyjne, interfejsy oraz dziedziczenie)
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        SoftwareCategory softwareCategory = new SoftwareCategory();
        HardwareCategory hardwareCategory = new HardwareCategory();

        SoftwareProduct softwareProduct1 = new SoftwareProduct("Rozlicz podatek", 79.99, "Windows XP");
        SoftwareProduct softwareProduct2 = new SoftwareProduct("Windows 7", 99.99, "32GB RAM");
        SoftwareProduct softwareProduct3 = new SoftwareProduct("Corel 12", 29.99, "Intel i7");

        softwareCategory.addProduct(softwareProduct1);
        softwareCategory.addProduct(softwareProduct2);
        softwareCategory.addProduct(softwareProduct3);

        HardwareProduct hardwareProduct1 = new HardwareProduct("Mouse", 99.99, "Razer");
        HardwareProduct hardwareProduct2 = new HardwareProduct("Keyboard", 129.99, "X-kom");
        HardwareProduct hardwareProduct3 = new HardwareProduct("Monitor", 999.99, "Dell");

        hardwareCategory.addProduct(hardwareProduct1);
        hardwareCategory.addProduct(hardwareProduct2);
        hardwareCategory.addProduct(hardwareProduct3);

        System.out.println("Hardware products: ");
        hardwareCategory.displayInfo();

        System.out.println();

        System.out.println("Software products: ");
        softwareCategory.displayInfo();
    }
}