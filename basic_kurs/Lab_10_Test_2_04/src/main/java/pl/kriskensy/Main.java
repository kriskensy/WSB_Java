//zad 4 - Zdefiniuj interfejs Pracownik zawierający dwie metody abstrakcyjne:
//*wykonajPrace() - która nie zwraca żadnej wartości i jest odpowiedzialna za wykonanie pracy przez pracownika,
//*pobierzOpis() - która zwraca String opisujący pracownika.
//Utwórz dwie klasy implementujące interfejs Pracownik:
//*Programista zawierający pole jezykProgramowania (typu String),
//*ManagerProjektu zawierający pole dzial (typu String).
//*W obu klasach pochodnych (Programista i ManagerProjektu) zaimplementuj metody interfejsu Pracownik w sposób specyficzny
//dla danego pracownika. Na przykład, programista może programować w określonym języku, a manager projektu może zarządzać działem.
//Stwórz program demonstracyjny, który:
//*Tworzy obiekty obu klas (Programista i ManagerProjektu),
//*Wywołuje metody wykonajPrace() dla każdego pracownika,
//*Wywołuje metody pobierzOpis() i wyświetla opis każdego pracownika.
package pl.kriskensy;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Java");
        ProjectManager projectManager = new ProjectManager("IT");

        programmer.doTheWork();
        projectManager.doTheWork();

        System.out.println();

        System.out.println(programmer.showDescription());
        System.out.println(projectManager.showDescription());
    }
}