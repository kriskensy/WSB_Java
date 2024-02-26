//3 Napisz Program w którym będziesz przekazywał 1 słowo jako parametr uruchamianego programu,
// a program bedzie sprawdział czy słowo jest palindromem
package pl.kriskensy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean palindrom = true;

        System.out.println("argument: " + args[0]);
        String stringOne = args[0];

        ArrayList<String> wordChars = new ArrayList<>();

        for (int i = stringOne.length() - 1; i >= 0; i--) {
            //System.out.print(stringOne.charAt(i)); //wyswietlenie tylko na sprawdzenie dla mnie
            wordChars.add(String.valueOf(stringOne.charAt(i)));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String character : wordChars) {
            stringBuilder.append(character);
        }

        String stringTwo = stringBuilder.toString();

        System.out.println("po konwersji:  " + stringTwo);

        if (stringOne.equals(stringTwo)) {
            System.out.println("wynik:  " + palindrom);
        } else {
            System.out.println("wynik:  " + !palindrom);
        }
    }
}