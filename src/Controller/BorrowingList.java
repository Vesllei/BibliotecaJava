package Controller;

import java.util.List;

import Models.Borrowing;

public class BorrowingList {
    private List<Borrowing> borrow;

    public BorrowingList(List<Borrowing> brw) {
        this.borrow = brw;
    }

    public Borrowing searchBorrowing(int id) {
        return borrow.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    public Borrowing searchBorrowing(String name) {
        return borrow.stream().filter(b -> b.getUser().getName() == name).findFirst().orElse(null);
    }

    public void addBorrowing(Borrowing bk) {
        if (searchBorrowing(bk.getId()) == null) {
            borrow.add(bk);
        }
    }

    public void report() {
        for (Borrowing user : borrow) {
            System.out.println("____________________________________" + "\n" +
                    "Id: " + user.getId() + "\n" +
                    "Livro emprestado: " + user.getBook() + "\n" +
                    "Usuário: " + user.getUser() + "\n" +
                    "Data de empréstimo: " + user.getTakeDate() + "\n" +
                    "Data de devolução prevista: " + user.getGivebackDate() + "\n" +
                    "Data de devolução efetiva: " + user.getGbrealDate() + "\n" +
                    "____________________________________");
        }

    }

    public String giveback(String date, int idbrw, RegisteredBooks rgBooks) {

        searchBorrowing(idbrw).setGbrealDate(date);
        rgBooks.searchBook(searchBorrowing(idbrw).getBook().getTitle()).setQuantPlus();

        return "O livro foi devolvido \n";
    }

    public List<Borrowing> getBorrow() {
        return borrow;
    }

    public void setBorrow(List<Borrowing> borrow) {
        this.borrow = borrow;
    }

    @Override
    public String toString() {
        return "BorrowingList [borrow=" + borrow + "]";
    }

}
