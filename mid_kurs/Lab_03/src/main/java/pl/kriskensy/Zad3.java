package pl.kriskensy;

import java.util.*;

public class Zad3 {
    public static void main(String[] args) {

        //Hashset
        String name1 = "Kasia";
        String name2 = "Maciek";
        String name3 = "Bartek";

        HashSet<String> names = new HashSet<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        //Hashmap
        HashMap<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Polska", "Warszawa");
        countriesAndCapitals.put("Niemcy", "Berlin");
        countriesAndCapitals.put("Francja", "Paryz");
        countriesAndCapitals.put("Turcja", "Istanbul");

        Set<String> keysHashMap = countriesAndCapitals.keySet();
        for (String key : keysHashMap) {
            System.out.println(key + " - " + countriesAndCapitals.get(key));
        }

        System.out.println(countriesAndCapitals.get("Polska"));
        System.out.println(countriesAndCapitals.containsKey("Niemcy"));
        System.out.println(countriesAndCapitals.containsValue("Paryz"));

        System.out.println();

        //Treeset
        TreeSet<String> cars = new TreeSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volkswagen");
        cars.add("Mercedes");

        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.remove("Audi"));
        System.out.println(cars);

        System.out.println();

        //Treemap
        TreeMap<Integer, String> documents = new TreeMap<>();

        documents.put(4, "order document");
        documents.put(3, "certificate");
        documents.put(5, "confirmation");
        documents.put(2, "invoice");
        documents.put(1, "bill");

        Set<Integer> keysTreeMap = documents.keySet();
        for (Integer key : keysTreeMap) {
            System.out.println(key + " - " + documents.get(key));
        }

        String docu = documents.get(2);
        System.out.println(docu);

        documents.remove(5);
        System.out.println(documents);
    }
}
