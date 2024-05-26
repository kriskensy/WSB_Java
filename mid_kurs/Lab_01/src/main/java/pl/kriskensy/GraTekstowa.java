package pl.kriskensy;

import java.util.ArrayList;
import java.util.Scanner;

public class GraTekstowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> plecak = new ArrayList<>();

        while (true) {
            System.out.println("co chcesz zrobic? (wloz / ekwipunek / wyciagnij / koniec)");
            switch (scanner.nextLine()) {
                case "wloz" -> wlozDoPlecaka(plecak, scanner.nextLine());
                case "ekwipunek" -> displayItems(plecak);
                case "wyciagnij" -> wyciagnijZPlecaka(plecak, scanner.nextLine());
                case "koniec" -> System.exit(0);
                default -> System.out.println("niepoprawna komenda!");
            }
        }
    }

    public static void wlozDoPlecaka(ArrayList<String> plecak, String itemName) {
        plecak.add(itemName);
        System.out.println("wlozone do plecaka: " + itemName);
    }

    public static void displayItems(ArrayList<String> plecak) {
        System.out.println("w plecaku znajduja sie: ");
        for (String item : plecak) {
            System.out.println(item);
        }
    }

    public static void wyciagnijZPlecaka(ArrayList<String> plecak, String itemName) {
        if (plecak.contains(itemName)) {
            plecak.remove(itemName);
            System.out.println("wyciagniete z plecaka: " + itemName);
        } else {
            System.out.println("w plecaku nie ma: " + itemName);
        }
    }
}