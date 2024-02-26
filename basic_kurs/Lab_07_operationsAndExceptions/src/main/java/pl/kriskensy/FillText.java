package pl.kriskensy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FillText { //zapis wartosci do pliku

    private static final String FILE_PATH = "C:/_temp/plikTestowy.txt"; // Ścieżka do pliku

    public static void main(String[] args) {

        try { // Tworzymy obiekt FileOutputStream, który wskazuje na plik, do którego będziemy zapisywać
            FileOutputStream fileOutputStream = new FileOutputStream(new
                    File(FILE_PATH));

            PrintStream customOut = new PrintStream(fileOutputStream); // Tworzymy obiekt PrintStream, który wskazuje na nasz niestandardowy strumień wyjścia

            System.setOut(customOut); // Zapisujemy niestandardowy strumień wyjścia (PrintStream) jako standardowy strumień wyjścia (System.out)

            System.out.println("Przykładowy tekst."); // Teraz wszystko, co jest wypisywane na System.out,
            // zostanie zapisane do pliku Poniższa linia odpowiada za powrót do standarowego strumienia wyjścia czyli
            // na konsole(możemy go użyć, jeśli chcemy przywrócić normalne wyjście na konsolę)

            System.setOut(System.out); // teraz wyjście będzie wyświetlane na konsole

            customOut.close(); // Zamykamy strumień wyjścia, co spowoduje też zamknięcie pliku
            System.out.println("Dane zostały zapisane do pliku.");
        } catch (Exception e) {

            e.printStackTrace(); // Obsługa błędów związanych z operacją zapisu do pliku
        }
    }
}