package pl.kriskensy;

public class GeneratorLiczb {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        printArray(array1);

        System.out.println();

        int[] array2 = new int[6];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6 + 1);
        }

        printArray(array2);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(" " + element);
        }
    }
}