package pl.kriskensy.rzutowanie;

public class Main {
    public static void main(String[] args) {
//        // Rzutowanie w górę
//        Figura figura = new Kwadrat();

        //Rzutowanie w dół z użyciem instanceof
        Figura figura = new Kwadrat();

        if (figura instanceof Kwadrat) {
            Kwadrat kwadrat = (Kwadrat) figura; // Rzutowanie w dół
        }
// Możemy teraz używać metod specyficznych dla Kwadratu
    }
}