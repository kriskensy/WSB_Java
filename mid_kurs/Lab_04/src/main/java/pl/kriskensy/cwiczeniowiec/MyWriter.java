package pl.kriskensy.cwiczeniowiec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is file name? ");

        String fileName = scanner.nextLine() + ".txt";

        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }

            System.out.println("what do you want to write to the file? ");
            String text = scanner.nextLine();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            scanner.close();
        }
    }
}