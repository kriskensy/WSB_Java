//Zad 6 - Porównać działanie operatora == i metody equals.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        int firstNumber = 3;
        int secondNumber = 7;

        String firstName = "Kasia";
        String secondName = "Piotrek";

        //== operator sluzy do porównywania liczb lub wartosci logicznych
        if (firstNumber == secondNumber) {
            System.out.println("int == " + true);
        } else {
            System.out.println("int == " + false);
        }

        //equals metoda sluzy do porownywania obiektow
        if (firstName.equals(secondName)) {
            System.out.println("String equals " + true);
        } else {
            System.out.println("String equals " + false);
        }

        //uwaga na porownania obiektow przez uzycie operatora ==
        //tak nie wolno porownywac objektow!
        String colorOne = "black";
        String colorTwo = "black";
        if (firstName == secondName) {
            System.out.println("the colors are the same");
        } else {
            System.out.println("the colors are NOT the same");
        }
    }
}