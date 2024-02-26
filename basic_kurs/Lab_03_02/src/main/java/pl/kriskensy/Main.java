//Zad 2 - Napisać program konwertujący łańcuch znaków na liczby odpowiednich typów( int, long, float, double).
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        String stringExample = "12548";//tutaj nalezy uwazac bo jesli string bedzie zawieral inne znaki to "parsowanie"
        // bedzie wyrzucac wyjatki, ktore nalezy obsluzyc

        int stringToInt = Integer.parseInt(stringExample);
        long stringToLong = Long.parseLong(stringExample);
        float stringToFloat = Float.parseFloat(stringExample);
        double stringToDouble = Double.parseDouble(stringExample);

        System.out.println("String to int: " + stringToInt);
        System.out.println("String to long: " + stringToLong);
        System.out.println("String to float: " + stringToFloat);
        System.out.println("String to double: " + stringToDouble);
    }
}