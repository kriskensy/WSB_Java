package pl.kriskensy;

import java.util.*;

public class Zad4 {
    public static void main(String[] args) {

        //==================== ArrayList

        ArrayList<String> list = new ArrayList<>();
        list.add("Pierwszy"); // Dodawanie elementów
        list.add("Drugi");
        list.add("Trzeci");

        list.add(1, "NowyDrugi");// Wstawianie elementu na określonej pozycji
        list.remove(0);// Usuwanie elementu na określonej pozycji
        list.remove("Drugi");// Usuwanie konkretnego elementu
        String arrayElement = list.get(0);// Pobieranie elementu na określonej pozycji
        list.set(0, "ZmodyfikowanyPierwszy");// Modyfikowanie elementu na określonej pozycji
        int rozmiarArray = list.size();// Sprawdzanie rozmiaru listy
        System.out.println("rozmiar listy: " + rozmiarArray);

        //==================== HashSet

//        HashSet<String> set = new HashSet<>();
//
//        set.add("jabłko");// Dodawanie elementów
//        set.add("banan");
//        set.add("gruszka");
//
//        set.remove("banan");// Usuwanie elementu
//        System.out.println("Elementy w secie: " + set);
//
//        if (set.contains("jabłko")) { // Sprawdzanie czy element istnieje
//            System.out.println("Znaleziono jabłko w secie.");
//        } else {
//            System.out.println("Nie znaleziono jabłka w secie.");
//        }
//
//        Iterator<String> iterator = set.iterator();// Iterowanie po elementach
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println("Element: " + element);

        //==================== HashMap 1

//            HashMap<String, Integer> mapOne = new HashMap<>();// Tworzenie obiektu HashMap
//
//            mapOne.put("Jan", 25);// Dodawanie wartości do mapy
//            mapOne.put("Anna", 30);
//            mapOne.put("Kamil", 35);
//
//            int wiekAnny = mapOne.get("Anna");// Pobieranie wartości na podstawie klucza
//            System.out.println("Wiek Anny: " + wiekAnny);

        //==================== HashMap 2

//            HashMap<String, Integer> map2 = new HashMap<>();
//
//            map2.put("jabłko", 3);
//            map2.put("banan", 5);
//            map2.put("gruszka", 2);
//
//            for (Map.Entry<String, Integer> entry : map2.entrySet()) {// Iterowanie po elementach mapy
//                String owoc = entry.getKey();
//                int ilosc = entry.getValue();
//                System.out.println("Owoc: " + owoc + ", Ilość: " + ilosc);
//            }

        //==================== HasMap 3

//            HashMap<String, String> map3 = new HashMap<>();
//
//            map3.put("Kraj", "Polska");// Dodawanie wartości do mapy
//            map3.put("Miasto", "Warszawa");
//
//            map3.put("Miasto", "Kraków");// Aktualizacja wartości na podstawie klucza
//            System.out.println("Kraj: " + map3.get("Kraj"));
//            System.out.println("Miasto: " + map3.get("Miasto"));

        //==================== LinkedList

//            LinkedList<String> lista = new LinkedList<>();// Tworzenie obiektu LinkedList
//
//            lista.add("jabłko");// Dodawanie elementów do listy
//            lista.add("banan");
//            lista.add("gruszka");
//
//            System.out.println("Zawartość listy:");// Wyświetlanie zawartości listy
//            for (String owoc : lista) {
//                System.out.println(owoc);
//            }
//
//            lista.addFirst("pomarańcza");// Dodawanie elementu na początku listy
//            lista.removeLast();// Usuwanie elementu z listy
//
//            System.out.println("\nZaktualizowana zawartość listy:");// Wyświetlanie zaktualizowanej zawartości listy
//            for (String owoc : lista) {
//                System.out.println(owoc);
//            }

        //==================== TreeMap

//            TreeMap<Integer, String> mapa = new TreeMap<>();// Tworzenie obiektu TreeMap
//
//            mapa.put(3, "jabłko");// Dodawanie elementów do mapy
//            mapa.put(1, "banan");
//            mapa.put(2, "gruszka");
//
//            System.out.println("Zawartość mapy:");
//            for (Integer klucz : mapa.keySet()) {// Wyświetlanie zawartości mapy
//                String wartosc = mapa.get(klucz);
//                System.out.println(klucz + ": " + wartosc);
//            }
//
//            String owoc = mapa.get(2);//Pobranie wartości po kluczu
//            System.out.println("Owoc dla klucza 2: " + owoc);
//
//            mapa.remove(3);//Usunięcie elementu
//
//            if (mapa.containsKey(1)) {//sprawdzenie istnienia klucza w mapie
//                System.out.println("Klucz 1 istnieje w mapie.");
//            } else {
//                System.out.println("Klucz 1 nie istnieje w mapie.");
//            }
//
//            int pierwszyKlucz = mapa.firstKey();//pobieranie pierwszego i ostatniego klucza
//            int ostatniKlucz = mapa.lastKey();
//            System.out.println("Pierwszy klucz: " + pierwszyKlucz);
//            System.out.println("Ostatni klucz: " + ostatniKlucz);
//
//            System.out.println("Posortowane klucze:");
//            for (Integer klucz : mapa.keySet()) {//pobranie posortowanego zestawu kluczy
//                System.out.println(klucz);
//            }

        //==================== TreeSet

//            TreeSet<Integer> treeSet = new TreeSet<>();
//
//            treeSet.add(5);// Dodanie elementów
//            treeSet.add(3);
//            treeSet.add(8);
//
//            System.out.println("Elementy TreeSet: " + treeSet);// Wyświetlenie elementów (uporządkowane)
//
//            treeSet.remove(3);// Usunięcie elementu
//            System.out.println("Czy 3 jest w zbiorze? " + treeSet.contains(3));// Sprawdzenie obecności elementu
//
//            System.out.println("Pierwszy element: " + treeSet.first());// Pierwszy i ostatni element
//            System.out.println("Ostatni element: " + treeSet.last());

        //==================== Queue

//            Queue<String> kolejka = new LinkedList<>();// Tworzenie kolejki FIFO
//
//            kolejka.add("Anna");// Dodawanie elementów do kolejki
//            kolejka.add("Bartek");
//            kolejka.add("Celina");
//
//            String pierwszaOsoba = kolejka.remove();// Usuwanie elementu z kolejki
//            System.out.println("Pierwsza osoba w kolejce: " + pierwszaOsoba);// Podglądanie pierwszej osoby w kolejce bez usuwania
//
//            String pierwszaOsobaBezUsuwanie = kolejka.peek();
//            System.out.println("Pierwsza osoba w kolejce (bez usuwania): " + pierwszaOsobaBezUsuwanie);
//
//            boolean czyPusta = kolejka.isEmpty();// Sprawdzanie, czy kolejka jest pusta
//            System.out.println("Czy kolejka jest pusta? " + czyPusta);
//
//            int rozmiarQueue = kolejka.size();// Pobieranie liczby elementów w kolejce
//            System.out.println("Liczba osób w kolejce: " + rozmiarQueue);
    }
}
