package Controller;

import Models.Borrowing;

public class Overduereport {

    public void generateReport(BorrowingList borrowings) {
        for (Borrowing b : borrowings.getBorrow()) {
            if (b.isOverdue()) {
                System.out.println("________________________________________");
                System.out.println("Usuário: " + b.getUser().getName());
                System.out.println("Livro: " + b.getBook().getTitle());
                System.out.println("Data de empréstimo" + b.getTakeDate());
                System.out.println("Data de devolução: " + b.getGivebackDate());
                System.out.println("________________________________________");
            }
        }
    }
}
