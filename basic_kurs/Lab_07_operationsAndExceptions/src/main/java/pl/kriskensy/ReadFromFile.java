package pl.kriskensy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile { //odczyt z pliku

    private static final String FILE_PATH = "C:/_temp/nowyPlikTestowy.txt"; // Ścieżka do pliku

    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader(FILE_PATH); // Tworzymy obiekt FileReader, który odczytuje znaki z pliku

            BufferedReader bufferedReader = new BufferedReader(fileReader); // Tworzymy obiekt BufferedReader, który umożliwia odczyt linia po linii

            String linia;
            while ((linia = bufferedReader.readLine()) != null) { // Odczytujemy tekst z pliku linia po linii
                System.out.println(linia);
            }

            bufferedReader.close(); // Zamykamy BufferedReader i FileReader
            fileReader.close();
        } catch (IOException e) {

            e.printStackTrace(); // Obsługa błędów związanych z operacją odczytu pliku
        }
    }
}