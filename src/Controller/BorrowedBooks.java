package Controller;

import java.util.List;

import Models.Book;

public class BorrowedBooks {
    private List<Book> books;

    public BorrowedBooks() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Borrowed [books=" + books +"]";
    }

}
