//Zad 11 - Napisz program w którym będzie klasa odpowiadająca za uzupełnienie tablic jedno i dwu wymiarowej,
// złożonej z 20 elementów, liczbami całkowitymi losowymi z  przedziału od 0 do 20.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

//        int randomNumber = (int) (Math.random()*21); //randomowa liczbe zmiennoprzecinkowa trzeba zrzutowac na liczbe calkowita
//        System.out.println(randomNumber);

        //deklaracja tablic jedno- oraz dwuwymiarowej
        int[] oneDimensionalArray = new int[20];
        int[][] twoDimensionalArray = new int[4][5];

        //wypelnie tablicy jednowymiarowej oraz wyswietlenie jej elementow
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            oneDimensionalArray[i] = (int) (Math.random() * 21); //mnoznik x21, zeby przedzial byl do 20 wlacznie
        }

        System.out.println("One-diemnsional arry: ");
        for (int element : oneDimensionalArray) {
            System.out.print(" " + element);
        }
        System.out.println();

        //wypelnienie tablicy dwuwymiarowej oraz wyswietlenie jej elementow
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = (int) (Math.random() * 21);
            }
        }

        System.out.println("Two-dimensional array: "); //petla zewnetrzna iteruje po wierszach a petla wewnetrzna po elementach
        for(int[] row : twoDimensionalArray) {
            for (int element : row) {
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}