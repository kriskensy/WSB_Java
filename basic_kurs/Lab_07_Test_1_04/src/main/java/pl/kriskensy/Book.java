package pl.kriskensy;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;

    public Book(String title, String author, String genre, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public static boolean sameAuthor(Book getAuthor) { //todo nie pasuje
        if (getAuthor.equals(getAuthor)) {
            return true;
        } else return false;
    }
}