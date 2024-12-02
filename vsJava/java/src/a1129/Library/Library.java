package a1129.Library;

public class Library {
    private static int indexCounter = 0;
    private int id;
    private String name;
    private String author;
    private int year;
    private boolean loan;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isLoan() {
        return loan;
    }

    public Library() {
    }

    public Library(String name, String author, int year, boolean loan) {
        this.id = ++indexCounter;
        this.name = name;
        this.author = author;
        this.year = year;
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Library [id=" + id + ", name=" + name + ", author=" + author + ", year=" + year + ", loan="
                + (loan ? "대출 가능" : "대출중")
                + "]";
    }

}
