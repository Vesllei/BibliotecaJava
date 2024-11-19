package Controller;

import java.util.List;
import Models.Book;

public class RegisteredBooks {
    private List<Book> books;

    public RegisteredBooks(List<Book> books) {
        this.books = books;
    }

    public Book searchBook(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElse(null);
    }

    public Book searchBooksauthor(String author) {
        return books.stream().filter(b -> b.getAuthor().equals(author)).findFirst().orElse(null);
    }

    public Book searchBook(int id) {
        return books.stream().filter(b -> b.getId() == (id)).findFirst().orElse(null);
    }

    public void addBook(Book bk) {
        if (searchBook(bk.getId()) == null || searchBook(bk.getTitle()) == null) {
            books.add(bk);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void report() {
        for (Book user : books) {
            System.out.println("____________________________________" + "\n" +
                    "Título: " + user.getTitle() + "\n" +
                    "Autor: " + user.getAuthor() + "\n" +
                    "Ano lançamento: " + user.getYear() + "\n" +
                    "Quantidades em estoque: " + user.getQuant() + "\n" +
                    "Popularidade: " + user.getPop() + "\n" +
                    "____________________________________");
        }

    }

    @Override
    public String toString() {
        return "RegisteredBooks [books=" + books + "]";
    }

}
