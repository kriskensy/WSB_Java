package pl.kriskensy;

import java.io.File;

public class DelFile { //usuniecie pliku

    private static final String FILE_PATH = "C:/_temp/nowyPlikTestowy.txt"; // Ścieżka do pliku

    public static void main(String[] args) {


        File plikDoUsuniecia = new File(FILE_PATH); // Tworzymy obiekt File reprezentujący plik

        if (plikDoUsuniecia.exists()) { // Sprawdzamy, czy plik istnieje przed próbą usunięcia

            if (plikDoUsuniecia.delete()) { // Usuwamy plik
                System.out.println("Plik został usunięty pomyślnie.");
            } else {
                System.out.println("Nie udało się usunąć pliku.");
            }
        } else {
            System.out.println("Plik nie istnieje.");
        }
    }
}