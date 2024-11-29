package a1129.Library;

public class Library {
    private String name;
    private String author;
    private String ISBN;
    private double price;
    private boolean loan;
    
    public boolean isLoan() {
        return loan;
    }
    public void setLoan(boolean loan) {
        this.loan = loan;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Library(String name, String author, String iSBN, double price, boolean loan) {
        this.name = name;
        this.author = author;
        ISBN = iSBN;
        this.price = price;
        this.loan = loan;
    }
    public Library() {
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Library [name=" + name + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + ",  " + (loan ? "대출 가능" : "대출불가") +  "]";
    }
}
