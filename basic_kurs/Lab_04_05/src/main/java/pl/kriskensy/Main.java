//Zad 5 - Stwórz tablice dwuwymiarową dla 100 elementów, wypełnij ją liczbami losowymi z zakresu od 20 do 45,
// następnie ją posortuj, oraz zlicz ilość wystąpień poszczególnych liczb  tworząc histogram.
package pl.kriskensy;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        //wypelnienie tablicy
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 26 + 20);
            }
        }//mnoznik *26 aby losowane liczby byly z przedzialu od 0 do 25 wlacznie a nastepnie +20
        // aby przesunac caly przedzial i uzsykac liczby od 20 do 45

        //wyswietlenie elementow tablicy -> stworzona metoda do wyswietlania elementow tablicy
        System.out.println("Unsorted array");
        printArray(array);
        System.out.println();

        //sortowanie -> 1. przerzucenie tablicy do tablicy jednowymiarowej, 2. posortowanie, 3. powrot do tablicy dwuwymiarowej
        int[] tempArray = new int[100];
        int tempArrayIndex = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tempArray[tempArrayIndex++] = array[i][j];
            }
        }

        Arrays.sort(tempArray);

        int arrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = tempArray[arrayIndex++];
            }
        }

        //wyswietlenie posortowanej tablicy
        System.out.println("Sorted array");
        printArray(array);
        System.out.println();

        //zliczanie poszczegolnych liczb -> hasmapa z braku innego pomyslu
        System.out.println("Elements appearances");
        HashMap<Integer, Integer> numbersAmount = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int currentNumber = array[i][j]; //przejscie po kolejnych liczbach
                if (numbersAmount.containsKey(currentNumber)) { // jesli Hashmapa zawiera juz dany klucz czyli aktualny element
                    int counter = numbersAmount.get(currentNumber); //to zwiekszam licznik
                    numbersAmount.put(currentNumber, counter + 1);
                } else {
                    numbersAmount.put(currentNumber, 1); // jesli nie to tworze klucz i ustawiam na 1
                }
            }
        }

        //wyswietlenie Hashmapy czyli zliczen elementow tablicy. Hashmapa nie gwarantuje niestety kolejnosci elementow
        for (int key : numbersAmount.keySet()) {
            int counter = numbersAmount.get(key);
            System.out.println("Number: " + key + ", has: " + counter + " appearances");
        }
    }

    //metoda do wyswietlania elementow tablicy
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}