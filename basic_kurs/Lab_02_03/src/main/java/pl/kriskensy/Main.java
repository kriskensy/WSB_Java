package pl.kriskensy;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //deklaracja i wypelnienie obu tablic przykladowymi liczbami
        int[] arrayOne = {1, 2, 3, 4, 5, 17, 2, 2, 1, 4, 13, 22, 123};
        int[] arrayTwo = {3, 8, 5, 116, 32, 2, 2, 4, 2, 6, 77, 6, 2};

        //wyswietlenie tablic -> tylko pomocniczo
//        System.out.print("Array one: ");
//        for (int i = 0; i < arrayOne.length; i++) {
//            System.out.print(arrayOne[i] + " ");
//        }
//        System.out.println();
//
//        System.out.print("Array two: ");
//        for (int i = 0; i < arrayTwo.length; i++) {
//            System.out.print(arrayTwo[i] + " ");
//        }

        //zad1 - suma wszystkich elementow
        int sumOfArrayOne = Arrays.stream(arrayOne).sum();
        System.out.println("Sum of array one elements: " + sumOfArrayOne);

        int sumOfArrayTwo = Arrays.stream(arrayTwo).sum();
        System.out.println("Sum of array two elements: " + sumOfArrayTwo);

        //zad2 - znajdowanie wartosci min, max -> przy pomocy klasy Arrays / stream
        int minArrayOne = Arrays.stream(arrayOne).min().getAsInt();
        int maxArrayOne = Arrays.stream(arrayOne).max().getAsInt();
        System.out.println("Array one MIN: " + minArrayOne);
        System.out.println("Array one MAX: " + maxArrayOne);

        int minArrayOTwo = Arrays.stream(arrayTwo).min().getAsInt();
        int maxArrayTwo = Arrays.stream(arrayTwo).max().getAsInt();
        System.out.println("Array two MIN: " + minArrayOTwo);
        System.out.println("Array two MAX: " + maxArrayTwo);

        //zad 2 - znajdowanie wartosci min, max -> po sortowaniu. W klasie Arrays jest implementacja qiucksorta (metoda sort), ktorym mozna posortowac tablice
        System.out.println();
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        System.out.println("Both arrays are sorted");
        System.out.println("Array one MIN: " + arrayOne[0]);
        System.out.println("Array one MAX: " + arrayOne[arrayOne.length - 1]);
        System.out.println("Array two MIN: " + arrayTwo[0]);
        System.out.println("Array two MAX: " + arrayTwo[arrayTwo.length - 1]);

        //zad 3 - srednia wartosci w tablicach
        System.out.println();
        double arrayOneAverage = Arrays.stream(arrayOne).average().getAsDouble();
        System.out.println("Array one average: " + arrayOneAverage);

        double arrayTwoAverage = Arrays.stream(arrayTwo).average().getAsDouble();
        System.out.println("Array two average: " + arrayTwoAverage);

        //zad 4 - kopia tablic
        int[] copyOfArrayOne = Arrays.copyOf(arrayOne, arrayOne.length);
        int[] copyOfArrayTwo = Arrays.copyOf(arrayTwo, arrayTwo.length);

        //zad 5 - elementy tablicy wieksze / mniejsze od danej wartosci. Dla obu tablic zrobilem rozne przypadki
        System.out.println();
        int valueOne = 4;
        int[] filteredArrayOne = Arrays.stream(arrayOne).filter(element -> element > valueOne).toArray();
        int valueTwo = 10;
        int[] filteredArrayTwo = Arrays.stream(arrayTwo).filter(element -> element < valueTwo).toArray();

        System.out.print("Filtered array one: ");
        for (int i = 0; i < filteredArrayOne.length; i++) {
            System.out.print(filteredArrayOne[i] + " ");
        }
        System.out.println();

        System.out.print("Filtered array two: ");
        for (int i = 0; i < filteredArrayTwo.length; i++) {
            System.out.print(filteredArrayTwo[i] + " ");
        }
        System.out.println();

        //zad 6 - usuwanie elementu i tworzenie nowej tablicy
        System.out.println();
        int elementToDelete = 2;
        int[] arrayOneWithoutElementToDelete = Arrays.stream(arrayOne).filter(element -> element != elementToDelete).toArray();
        int[] arrayTwoWithoutElementToDelete = Arrays.stream(arrayTwo).filter(element -> element != elementToDelete).toArray();

        System.out.print("Array one without element to delete: ");
        for (int i = 0; i < arrayOneWithoutElementToDelete.length; i++) {
            System.out.print(arrayOneWithoutElementToDelete[i] + " ");
        }
        System.out.println();

        System.out.print("Array two without element to delete: ");
        for (int i = 0; i < arrayTwoWithoutElementToDelete.length; i++) {
            System.out.print(arrayTwoWithoutElementToDelete[i] + " ");
        }

        //zad 7 - laczenie obu tablic
        System.out.println();
        int[] arrayOneTwo = new int[arrayOne.length + arrayTwo.length]; //tworze nowa tablice o wielkosci rownej
        // lacznej wielkosci obu tablic i do niej kopiuje obie tablice
        System.arraycopy(arrayOne, 0, arrayOneTwo, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, arrayOneTwo, arrayOne.length, arrayTwo.length);
        Arrays.sort(arrayOneTwo); //tu tylko posortowane dla przejrzystosci przy wyswietlaniu

        System.out.print("Array one + two: ");
        for (int i = 0; i < arrayOneTwo.length; i++) {
            System.out.print(arrayOneTwo[i] + " ");
        }

        //zad 8 - zliczanie wystapien danej wartosci w tablicy nr 2. Liczba wystapien musi byc typu long!
        System.out.println();
        int valueToFind = 2;
        long numberOfAppearances = Arrays.stream(arrayTwo).filter(element -> element == valueToFind).count();

        System.out.println("Number of value " + valueToFind + " appearances: " + numberOfAppearances);
    }
}