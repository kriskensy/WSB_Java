package pl.kriskensy.cwiczeniowiec;

import java.util.Objects;

public class ExampleOBJ {

    private int id;
    private String name;

    public ExampleOBJ(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleOBJ that = (ExampleOBJ) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Example object {id=" + id + ", name=" + name + "}";
    }
}
