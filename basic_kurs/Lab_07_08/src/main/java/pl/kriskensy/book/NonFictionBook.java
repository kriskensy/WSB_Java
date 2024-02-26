package pl.kriskensy.book;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, int yearOfPublication) {
        super(title, author, yearOfPublication);
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction book: " + getTitle() + ", author: " + getAuthor() + ", year of publication: " + getYearOfPublication());
    }

    @Override
    public String toString() {
        return "Book: " + getAuthor() + ", author: " + getAuthor() + ", year of publication: " + getYearOfPublication();
    }
}