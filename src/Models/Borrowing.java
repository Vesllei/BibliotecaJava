package Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Controller.BorrowingList;
import Controller.RegisteredBooks;
import Controller.Registeredusers;

public class Borrowing {
    private LocalDate takeDate, givebackDate, gbrealDate;
    private Book book;
    private int id;
    private User user;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static int nextId = 1;

    public Borrowing(String takeDate, String givebackDate,
            String name, int idbook, Registeredusers userList,
            RegisteredBooks bookList, BorrowingList brwList) {

        givebackDate.replaceAll("[/\\s-]", "-");

        this.givebackDate = LocalDate.parse(givebackDate, this.formatter);

        this.id = nextId++;
        this.book = bookList.searchBook(idbook);
        if (name == brwList.searchBorrowing(name).getUser().getName()) {
            this.user = userList.searchUsers(name);
        }
        bookList.searchBook(id).setQuantMinus();
        bookList.searchBook(id).setPop();
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return givebackDate.isBefore(currentDate);
    }

    public LocalDate getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(String takeDate) {
        takeDate.replaceAll("[/\\s-]", "-");

        LocalDate localDate = LocalDate.parse(takeDate, this.formatter);

        this.gbrealDate = localDate;
    }

    public LocalDate getGivebackDate() {

        return givebackDate;
    }

    public void setGivebackDate(String gbackDate) {

        gbackDate = gbackDate.replaceAll("[/\\s-]", "-");

        LocalDate localDate = LocalDate.parse(gbackDate, this.formatter);
        this.givebackDate = localDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getGbrealDate() {
        return gbrealDate;
    }

    public void setGbrealDate(String date) {
        date.replaceAll("[/\\s-]", "-");

        LocalDate localDate = LocalDate.parse(date, this.formatter);

        this.gbrealDate = localDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Borrowing [takeDate=" + takeDate + ", givebackDate=" +
                givebackDate + ", gbrealDate=" + gbrealDate +
                ", book=" + book + ", id=" + id + ", user=" + user + "]";
    }

}
