package QuanLySach;

public class Book implements Comparable<Book>{
    private String nameBook;
    private Author author;//khoi tao mot lop ta gia
    private double price;
    private final int qty;//so luong dau sach

    public Book(String nameBook, double price, int qty, Author author) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Details :" + "\n" + this.nameBook + "\n" + (int)this.price + "\n" + this.qty + "\n" + "Author Information: " + "\n" + this.author.toString();
    }

    @Override
    public int compareTo(Book obj){
        if(this.getPrice() != obj.getPrice()){
            if(this.getPrice() > obj.getPrice()){
                return -1;//xep this dung truoc
            }
            else return 1;
        }
        else return this.getNameBook().compareTo(obj.getNameBook()); // tra ve 1 hoac -1
    }
}
