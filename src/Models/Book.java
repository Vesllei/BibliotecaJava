package Models;

public class Book implements Comparable<Book> {
    private String title, author;
    private int id, quant, pop;
    private int year;
    private static int nextId = 1;

    public Book(String title, String author, int quant, int year) {
        this.title = title;
        this.author = author;
        this.id = nextId++;
        this.quant = quant;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuantMinus() {
        this.quant = this.quant--;
    }

    public void setQuantPlus() {
        this.quant = this.quant++;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPop() {
        return pop;
    }

    public void setPop() {
        this.pop = this.pop++;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", quant=" +
                quant + ",year=" + year + ", popularity=" + pop + "]";
    }

    @Override
    public int compareTo(Book o) {
        return 2;
    }

}
