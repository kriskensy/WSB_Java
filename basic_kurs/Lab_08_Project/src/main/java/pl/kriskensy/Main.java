//1. W ramach zajęć wykonaj aplikację konsolową, aplikacja może dotyczyć dowolnej dziedziny(dobrze by było aby Państwo
//wybrali dziedzinę w której się specjalizujecie bądź pracujecie, ułatwi mi to ocenę Państwa pracy), może to być
//np. gra wyświetlana w konsoli, prosty program do zarządzania biblioteką, kontem bankowym, aplikacja użytkowa itp.

//2. Aplikacja ma wykorzystywać informacje podane od użytkownika oraz posiadać minimum 4 różne funkcjonalności.
//Musi ona bazować na obiektowości, wykorzystywać obiekty, wykorzystajcie konstruktory klasy bazowej, setery i gettery,
//dziedziczenie oraz polimorfizm, klasy abstrakcyjne, posiadać interfejsy, wykorzystywać tablice do przechowywania informacji
//czyli to z czym Państwo pracowali na zajęciach z Javy.

//3. Prosił bym też o zachowanie stylu pisania programów, zasada jedna funkcjonalność jedna klasa, wykorzystywanie pakietów,
//dodatkową funkcjonalnością będzie odczyt z pliku i zapis do niego danych.

//4. Aplikacja nie musi zawierać skomplikowanych algorytmów, muszą Państwo wykorzystać język obiektowy i narzędzia
//jakie daje Java do stworzenia funkcjonalności aplikacji.

package pl.kriskensy;

import pl.kriskensy.drive.HDDDrive;
import pl.kriskensy.drive.SSDDrive;
import pl.kriskensy.file.document.DocFile;
import pl.kriskensy.file.image.JPGImageFile;
import pl.kriskensy.file.music.MP3File;
import pl.kriskensy.usbdevice.Headphones;
import pl.kriskensy.usbdevice.Keyboard;
import pl.kriskensy.usbdevice.Mouse;
import pl.kriskensy.usbdevice.USBDevice;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Computer
        Monitor monitor = new Monitor("Dell");
        //Drive hddDrive = new HDDDrive();
        SSDDrive ssdDrive = new SSDDrive();
        Computer computer = new Computer(monitor, ssdDrive);

        //Monitor settings -> example
        int operation = 0;
        while (operation != 4) {
            System.out.println("Setting monitor resolution:");
            System.out.println("1. Show current resolution.");
            System.out.println("2. Set low resolution (800x600).");
            System.out.println("3. Set high resolution (3840x1920).");
            System.out.println("4. Skip this step.");
            System.out.println("5. End of program.");

            operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1 -> System.out.println("Monitor resolution is: " + monitor.getResolution());
                case 2 -> {
                    monitor.setLowResolution();
                    System.out.println("Low resolution set");
                }
                case 3 -> {
                    monitor.setHightResolution();
                    System.out.println("High resolution set");
                }
                case 4 -> System.out.println("Step skipped.");

                case 5 -> {
                    System.out.println("Exit");
                    System.exit(0);
                }
                default -> System.out.println("Incorrect selection");
            }
        }

        System.out.println();

        //USB Devices
        Mouse razerMouse = new Mouse("Razer");
        Headphones boseHeadphones = new Headphones("Bose");
        Keyboard keyboard = new Keyboard("X-kom");

        computer.addUSBDevice(razerMouse);
        computer.addUSBDevice(boseHeadphones);
        computer.addUSBDevice(keyboard);

        System.out.println();

        List<USBDevice> usbDevices = computer.getUsbDevices();

        for (USBDevice device : usbDevices) {
            System.out.println(device.getName());
        }

        System.out.println();

        computer.removeUSBDevice(razerMouse);
        computer.removeUSBDevice(boseHeadphones);
        computer.removeUSBDevice(keyboard);

        //Creating file -> example
        System.out.println("Creating document file:");
        System.out.println("Give file a name: ");
        String fileName = scanner.nextLine();
        System.out.println("What is file size?");
        int fileSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Provide text for entries in the document");
        String documentText = scanner.nextLine();

        DocFile docFile = new DocFile(fileName, fileSize, documentText);
        docFile.writeToFile(docFile);
        docFile.readFromFile();

        //Files
        MP3File mp3File = new MP3File("audio.mp3", 4000, "Zenek Martyniuk", "Bialy Mis", 192);
        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 50);

        //add files
        computer.addFile(mp3File);
        computer.addFile(jpgImageFile);
        computer.addFile(docFile);

        //list all files
        computer.listFiles();

        //methods
        System.out.println(mp3File.getType());
        System.out.println(mp3File.getName());
        System.out.println(mp3File.getQuality());
        mp3File.play();

        System.out.println(jpgImageFile.getType());
        System.out.println(jpgImageFile.getName());
        jpgImageFile.showImage();

        System.out.println(docFile.getType());
        System.out.println(docFile.getName());
    }
}