package Composition;

import java.util.List;

public class Library {
    private List<Book> books;
    Library(List<Book> books) {
        this.books = books;
    }
    List<Book> getTotalBooks() {
        return books;
    }

}
