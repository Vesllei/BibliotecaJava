import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Controller.BorrowingList;
import Controller.RegisteredBooks;
import Controller.Registeredusers;
import Models.Book;
import Models.Borrowing;
import Models.User;

public class App {
    public static void main(String[] args) throws Exception {

        int opc;
        Scanner scanf = new Scanner(System.in);
        RegisteredBooks bookList;
        Registeredusers userList;
        BorrowingList borro;

        User us1 = new User("Joaquim", 123, "rua 2", "Joaquim@gmail.com");
        User us2 = new User("Lopes", 321, "rua 1", "Lopes@gmail.com");
        User us3 = new User("Arthur", 456, "rua 4", "Arthur@gmail.com");
        User us4 = new User("Nicolas", 654, "rua 8", "Nicolas@gmail.com");
        User us5 = new User("Maicon", 834, "rua 7", "Maicon@gmail.com");

        userList.addUser(us5);
        userList.addUser(us2);
        userList.addUser(us3);
        userList.addUser(us4);
        userList.addUser(us5);

        Book lv1 = new Book("Crepusculo", "Josué", 10, 1989);
        Book lv2 = new Book("Crepusculo Lua Nova", "Josué", 5, 1995);
        Book lv3 = new Book("Crepusculo Eclipse", "Josué", 1, 2000);
        Book lv4 = new Book("Crepusculo Amanhecer", "Josué", 13, 2003);
        Book lv5 = new Book("Crepusculo Amanhecer 2", "Josué", 5, 2004);

        bookList.addBook(lv1);
        bookList.addBook(lv2);
        bookList.addBook(lv3);
        bookList.addBook(lv4);
        bookList.addBook(lv5);

        do {
            System.out.println("Bem-vindo ao Sistema de Biblioteca!\n");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Cadastrar novo usuário");
            System.out.println("3. Empréstimo de Livros");
            System.out.println("4. Devolução de Livros");
            System.out.println("5. Relatórios");
            System.out.println("0. Sair\n");

            System.out.print("Por favor, escolha uma opção: ");
            opc = scanf.nextInt();
            scanf.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String title = scanf.next();
                    System.out.println("Digite o autor do livro:");
                    String aut = scanf.next();
                    System.out.println("Quantos livros você vai adicionar?");
                    int qt = scanf.nextInt();

                    int yr;
                    do {
                        System.out.println("Em que ano ele foi lançado?");
                        yr = scanf.nextInt();

                        if (yr > LocalDate.now().getYear()) {
                            System.out.println("O ano inserido é maior que o ano atual");
                            System.out.print("Digite novamente, ");
                        }
                    } while (yr > 2024);

                    bookList.addBook(new Book(title, aut, qt, yr));
                    break;
                case 2:
                    System.out.println("Digite o nome do usuário:");
                    String nm = scanf.next();
                    System.out.println("Digite o telefone:");
                    int tele = scanf.nextInt();
                    System.out.println("Digite o endereço:");
                    String addresse = scanf.nextLine();
                    System.out.println("Digite o email:");
                    String email = scanf.nextLine();
                    do {
                        System.out.println("Em que ano ele foi lançado?");
                        yr = scanf.nextInt();

                        if (yr > LocalDate.now().getYear()) {
                            System.out.println("O ano inserido é maior que o ano atual");
                            System.out.print("Digite novamente, ");
                        }
                    } while (yr > 2024);

                    userList.addUser(new User(nm, tele, addresse, email));
                    break;
                case 3:
                    System.out.println("Digite sua data:");
                    String takeDate = scanf.nextLine();
                    System.out.println("Digite sua data:");
                    String pdate = scanf.nextLine();
                    System.out.println("Digite o Id do seu livro:");
                    int idbook = scanf.nextInt();
                    System.out.println("Digite seu nome:");
                    String username = scanf.nextLine();
                    Borrowing borrow = new Borrowing(takeDate, pdate, 
                    username, idbook, userList, bookList, borro);

                    borro.addBorrowing(borrow);
                    break;
                case 5: 
                    int opcinfo;

                    System.out.println("Qual relatório você quer visualizar!\n");
                    System.out.println("1. Relatórios de livros cadastrados");
                    System.out.println("2. Relatórios de usuários cadastrados");
                    System.out.println("3. Relatórios de usuários em atraso");
                    System.out.println("4. Devolução de Livros");
                    System.out.println("5. Relatórios");
                    System.out.println("0. Sair\n");
                    
                    switch (opcinfo) {
                        case 1:
                            
                            break;
                    
                        default:
                            break;
                    }
                    for (BorrowingList borrowingList2 : borrowingList) {
                        
                    

                    break;

                case 0:
                    System.out.println("Saindo do Sistema de Biblioteca. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opc != 0);

        scanf.close();
    }
}