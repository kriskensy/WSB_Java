//zad 6 - Napisz program bazując na poprzednich zadaniach który pobiera od użytkownika wszystkie informacje, i na ich
// podstawie tworzy nowy obiekt a potem zapisuje go do pliku nadpisując plik.

package pl.kriskensy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "C:/_temp/nadpisanyPlik.txt";

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
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(car.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}