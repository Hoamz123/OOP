package InvoiceAndCustomer;

import java.util.Scanner;

public class Customer {
    private final int idCustomer;//id khach hang
    private final String name;
    private final int discount;//phan tran giam gia

    public Customer(Scanner sc) {
        idCustomer = sc.nextInt();
        sc.nextLine();//chong troi lenh
        name = sc.nextLine();
        discount = sc.nextInt();
    }

    @Override
    public String toString() {
        return this.idCustomer + " " + this.name + " " + this.discount;
    }

    public int getDiscount() {
        return discount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }
}
