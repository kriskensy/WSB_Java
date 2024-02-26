//Zad 7 - Wykorzystać interfejsy: Serializable, Cloneable, Comparable we własnych dowolnych klasach
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Document agreement = new Document("Agreement", 6);
        System.out.println("Serializable: " + agreement);

        Book bookPaniJeziora = new Book("A. Sapkowski", "Pani Jeziora");
        System.out.println(bookPaniJeziora.toString() + " -> this is original");
        try {
            Book copyOfbookPaniJeziora = (Book) bookPaniJeziora.clone();
            System.out.println(copyOfbookPaniJeziora + " -> this is a copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Car car1 = new Car("Audi", "A8", 3000);
        Car car2 = new Car("Ford", "Focus", 1200);
        int compareResult = car1.compareTo(car2);
        System.out.println("Compare result: " + compareResult);
    }
}