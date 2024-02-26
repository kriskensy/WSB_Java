//1 Napisz metode która wypełni tablice 2 wymairową 1000 liczb zmiennoprzecinowych do 2 miejsc po przecinku,
// losowych z zakresu Od 55 do 60, a następwnei wypiszę liczbę wystąpień każdej generowanej lcizby w postaci "histogramu"

package pl.kriskensy;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        double[][] array = new double[40][25];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (double) (Math.random() * 5 + 55);
                array[i][j] = Math.round(array[i][j] * 100 / 100);
            }
        }

        printArray(array);
        System.out.println();

        System.out.println("Wystapienia");
        HashMap<Double, Integer> numbersAmount = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double currentNumber = array[i][j];
                if (numbersAmount.containsKey(currentNumber)) {
                    int counter = numbersAmount.get(currentNumber);
                    numbersAmount.put(currentNumber, counter + 1);
                } else {
                    numbersAmount.put(currentNumber, 1);
                }
            }
        }

        for (Double key : numbersAmount.keySet()) {
            int counter = numbersAmount.get(key);
            System.out.println("Liczba: " + key + ", ma: " + counter + " wystapien");
        }
    }

    //wyswietlanie
    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double element : row) {
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}