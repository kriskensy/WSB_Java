//Zad 6 - Zapoznać się z dokumentacją klasy Object (clone(), equals(), finalize(), toString())
//Zad 7 - Stworzyć prosta klasę z kilkoma polami, i przetestować powyższe metody w stworzonej  klasie.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        User userOne = new User("Kasia", "Kowalska", 2022, 123456);
        User userTwo = new User("Zosia", "Nowak", 2023, 987654);
        User userThree = new User("Kasia", "Kowalska", 2022, 123456);
        User userFour = new User("Bartek", "Poniedzialek",1999,568749);

        //equals()
        System.out.println("are both users the same? " + userOne.equals(userTwo));
        System.out.println("are both users the same? " + userOne.equals(userThree));
        System.out.println();

        //toString()
        System.out.println(userFour); //wyswietlenie z wykorzystaniem metody toString
        System.out.println();

        //clone()
        try {
            User clonedObject = (User) userTwo.clone(); //klonowanie
            System.out.println("are cloned objects equals? " + userTwo.equals(clonedObject));
            System.out.println("===original user: ");
            userTwo.print(); //wyswietlanie oryginalnego obiektu
            System.out.println();
            System.out.println("===cloned user: ");
            clonedObject.print(); //wyswietlenie klonowanego obiektu
        } catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }
        System.out.println();

        //finalize() -> Tworzenie i usuwanie obiektów
        for (int i = 0; i < 100; i++) {
            new User();
        }
        System.gc(); // Sugestia uruchomienia Garbage Collector'a
    }
}