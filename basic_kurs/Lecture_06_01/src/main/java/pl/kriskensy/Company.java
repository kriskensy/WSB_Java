package pl.kriskensy;

public class Company {
    private String name;
    private DataBase db;

    public Company(String name) {
        this.name = name;
        db = new DataBase();
    }

    public DataBase GetDataBase() {
        return db;
    }
}