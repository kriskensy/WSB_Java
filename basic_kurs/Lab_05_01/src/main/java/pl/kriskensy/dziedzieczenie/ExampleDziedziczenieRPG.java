package pl.kriskensy.dziedzieczenie;

public class ExampleDziedziczenieRPG {
    public static void main(String[] args) {
// Tworzenie obiektu klasy Bohater
        Bohater bohater = new Bohater("Aragorn", 10, 100, "Mieczobranie");
// Wywołanie metody dziedziczonej po klasie Postać
        bohater.atak();
// Wywołanie metody specyficznej dla klasy Bohater
        bohater.użyjUmiejętności();
// Wywołanie metody dziedziczonej po klasie Postać
        bohater.otrzymajObrażenia(20);
    }
}
