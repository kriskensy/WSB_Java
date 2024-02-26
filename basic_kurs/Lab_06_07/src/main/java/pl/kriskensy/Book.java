package pl.kriskensy;

public class Book implements Cloneable {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return author + " wrote " + title + " book.";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}