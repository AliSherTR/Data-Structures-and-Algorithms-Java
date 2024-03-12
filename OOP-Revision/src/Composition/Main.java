package Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book b1
                = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
                = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                "Herbert Schildt");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Library library = new Library(books);
        List<Book> bks = library.getTotalBooks();
        for(Book bk : bks) {
            System.out.println(bk.name +" by " + bk.author);
        }
    }
}
