package pl.kriskensy;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private int publicYear;

    public Book() {
    }

    public Book(String title, String author, String genre, int numberOfPages, int publicYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.publicYear = publicYear;
    }

    @Override
    public int compareTo(Book anotherBook) {
        return Integer.compare(this.publicYear, anotherBook.publicYear);
    }

    public String toString() {
        return "Title: " + title + " Author: " + author + " Public year: " + publicYear;
    }
}