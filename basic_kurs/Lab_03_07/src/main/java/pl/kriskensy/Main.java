//Zad 7 - Napisz w Javie metodę, która przyjmuje tablicę liczb całkowitych i odwraca jej kolejność.
//Wykorzystaj pętlę for do przejścia przez tablicę.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {
        int[] basicArray = new int[10];

        //wypelnienie tablicy zwyklym forem
        for (int i = 0; i < basicArray.length; i++) {
            basicArray[i] = i;
        }

        //odczyt tablicy i wyswietlenie
        System.out.print("Array: ");
        for (int arrayElement : basicArray) {
            System.out.print(" " + arrayElement);
        }
        System.out.println();

        //wywolanie metody na tablicy podstawowej
        reverseArray(basicArray);

        //wyswietlenie odwroconej tablicy
        System.out.print("Reversed array: ");
        for (int arrayElement : basicArray) {
            System.out.print(" " + arrayElement);
        }
    }

    //metoda do odwracania tablicy - przyjmuje tablice i zamienia elementy na krancach tablicy przez co uzyskuje sie odwrocenie jej kolejnosci.
    // Iterujemy do polowy jej dlugosci i w kazdej iteracji przypisujemy zmienna spod danego indeksu do zmiennej tymczasowej temp,
    // w ten sposob mozna do zmiennej indeksowanej przypisac zmienna spod odpowiadajacego indeksu "od konca"
    // i w nastepnym kroku nadpisac ta zmienna "od konca" przez zmienna, ktora zostala przypisana do zmiennej tymczasowej.
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}