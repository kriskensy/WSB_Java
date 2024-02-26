//zad 3 - Napisz program pozwalający zapisać tablice typów prostych do pliku, oraz odczytać ją.
//zad 4 - Napisz program w którym zapiszesz tablice obiektów do plików i ją odczytasz.
package pl.kriskensy;

import java.io.*;
import java.util.Arrays;

public class Main {

    private static final String FILE_PATH1 = "C:/_temp/typyProste.txt";
    private static final String FILE_PATH2 = "C:/_temp/obiekty.txt";

    public static void main(String[] args) {

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        Car[] cars = new Car[5];

        cars[0] = new Car("Audi", "A8", 2000);
        cars[1] = new Car("BMW", "1", 2005);
        cars[2] = new Car("Ford", "Focus", 2008);
        cars[3] = new Car("Fiat", "Panda", 2006);
        cars[4] = new Car("Mercedes", "AMG", 2003);

//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }
//
//        System.out.println(Arrays.toString(numbers));

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Arrays.toString(numbers));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader(FILE_PATH1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Arrays.toString(cars));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("reading objects");
            FileReader fileReader = new FileReader(FILE_PATH2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}