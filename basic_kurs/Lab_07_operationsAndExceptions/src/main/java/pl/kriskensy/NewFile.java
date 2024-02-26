package pl.kriskensy;

import java.io.File;
import java.io.IOException;

public class NewFile { //stworzenie nowego pliku

    private static final String FILE_PATH = "C:/_temp/nowyPlikTestowy.txt"; // Ścieżka do pliku

    public static void main(String[] args) {

        try {
            File nowyPlik = new File(FILE_PATH); // Tworzymy obiekt File reprezentujący plik

            if (nowyPlik.createNewFile()) { // Sprawdzamy, czy plik już istnieje
                System.out.println("Plik został utworzony pomyślnie.");
            } else {
                System.out.println("Plik już istnieje.");
            }
        } catch (IOException e) {

            e.printStackTrace(); // Obsługa błędów związanych z operacją tworzenia pliku
        }
    }
}