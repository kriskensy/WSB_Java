//zad 3 - Przetestować działanie operatora trójargumentowego.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        int result = 0;

        int numberOne = 17;
        int numberTwo = 5;

        //jesli numberOne jest mniejsza od numberTwo to do zmiennej result zostanie przypisana numberOne,
        // w przeciwnym przypadku do zmiennej result zostanie przypisana zmienna numberTwo
        result = numberOne < numberTwo ? numberOne : numberTwo;
        System.out.println(result);
    }
}