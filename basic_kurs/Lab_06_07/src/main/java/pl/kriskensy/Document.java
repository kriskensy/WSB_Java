package pl.kriskensy;

import java.io.Serializable;

public class Document implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int numberOfPages;

    public Document(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Document: " + name + " has " + numberOfPages + " pages.";
    }
}