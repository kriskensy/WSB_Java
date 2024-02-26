//Zad 9 - Stwórz klasę Pracownik z polami takimi jak imie, nazwisko, stanowisko itp. Następnie utwórz obiekt anonimowy
//tej klasy i użyj go do utworzenia jednorazowej instancji pracownika z określonymi danymi.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Robert", "Nowak", "Ingenieur", 8000) {
            @Override
            public String toString() {
                return "Employee: " + getName() + " gets a paycheck of: " + getPaycheck();
            }
        };

        System.out.println(employee.toString());
    }
}