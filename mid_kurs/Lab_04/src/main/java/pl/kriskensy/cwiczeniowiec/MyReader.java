package pl.kriskensy.cwiczeniowiec;

import java.io.*;
import java.util.Scanner;

public class MyReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is file name? ");
        String fileName = scanner.nextLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            scanner.close();
        }
    }
}
