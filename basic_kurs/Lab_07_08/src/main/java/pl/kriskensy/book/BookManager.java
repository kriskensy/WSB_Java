package pl.kriskensy.book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private final static String FILE_PATH = "C:/_temp/Books.txt";
    private List<Book> books = new ArrayList<>();

    public BookManager() {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void writeBooksInfoToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(books.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readBooksFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}