package pl.kriskensy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is file name?");

        String fileName = scanner.nextLine() + ".txt";

        try {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("which text should be written in that file?");
                String textToWrite = scanner.nextLine();
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(textToWrite);
                fileWriter.close();
            } else {
                System.out.println("file already exists, should it be overwritten?");
                String overwriteText = scanner.nextLine();

                if (overwriteText.equals("yes")) {
                    System.out.println("which text should be written in that file?");
                    String textToWrite = scanner.nextLine();
                    FileWriter fileWriter = new FileWriter(fileName);
                    fileWriter.write(textToWrite);
                    fileWriter.close();
                } else {
                    System.out.println("The End :)");
                }
            }

        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            scanner.close();
        }
    }
}