//Zad 2 - Ustalić kiedy zostaje uruchomiony Garbage Collector
//Zad 3 - Zbadać co się dzieje przy ręcznym uruchomieniu Garbage Collectora
package pl.kriskensy;

public class GCExample {
    public static void main(String[] args) {
        // Tworzenie i usuwanie obiektów
        for (int i = 0; i < 10000; i++) {
            new GCExample();
        }
        System.gc(); // Sugestia uruchomienia Garbage Collector'a
    }

    // Przykładowy obiekt
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed.");
    }
}