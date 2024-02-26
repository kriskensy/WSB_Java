//Zad 8 - Stwórz interfejs Zamowienie z metodą obliczCene i pokazSzczegoly. Następnie utwórz dwie klasy: Produkt i Usługa,
//implementujące interfejs Zamowienie i dostarczające własne implementacje obliczeń ceny oraz prezentacji szczegółów zamówienia.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Product notebookDell = new Product("Notebook Dell", 9500, 3);
        Service windowsUpdates = new Service("Windows updates", 600, 10);

        System.out.println("Your ordered products: ");
        notebookDell.printInformations();
        System.out.println();

        System.out.println("Your ordered servicees: ");
        windowsUpdates.printInformations();
    }
}