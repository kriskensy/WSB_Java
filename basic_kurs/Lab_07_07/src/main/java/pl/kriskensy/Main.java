//zad 7 - Zmodyfikuj program tak aby każdy nowo utworzony obiekt był dopisywany do pliku tekstowego.
package pl.kriskensy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "C:/_temp/dopisywanyObiekt.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a new car.");
        System.out.println("What brand is it?");
        String brand = scanner.nextLine();
        System.out.println("What model is it?");
        String model = scanner.nextLine();
        System.out.println("What is engine capacity?");
        double engineCapacity = scanner.nextDouble();

        Car car = new Car(brand, model, engineCapacity);

        //System.out.println(car);

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(car.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}