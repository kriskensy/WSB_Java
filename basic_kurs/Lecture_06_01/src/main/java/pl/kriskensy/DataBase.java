//zbior zbiorow
package pl.kriskensy;

public class DataBase {
    private Products setOfProducts;
    //private Cars setOfCars;
    //private Employees setOfEmployees;
    //inne zbiory

    public DataBase() { //metoda tylko do zwracania pola bo set jest prywatny
        setOfProducts = new Products();
        //inne zbiory
    }

    public Products GetSetOfProducts() {
        return setOfProducts;
    }
}