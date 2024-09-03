package BookAndAuthor;

import java.util.ArrayList;
import java.util.List;

public class sach {
    private final String nameBook;
    private final List<tacgia> tg;//khai bao mot mang de chua tac gia
    private final int price;
    private final int qty;//so luong dau sach

    public sach(String nameBook, int price, int qty, List<tacgia> authors){
        this.nameBook = nameBook;//ten sach
        this.price = price;//gia tien
        this.qty = qty;//so luong
        this.tg = authors;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Book Information: \n" + this.nameBook + "\n" + this.price + "\n" + this.qty + "\n----------------" + "\nAuthor Information";
    }

    public List<tacgia> getTg() {
        return tg;
    }
}
