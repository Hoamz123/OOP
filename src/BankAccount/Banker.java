package BankAccount;
import java.util.*;

public class Banker {
    private final String ID;
    private final String customerID;
    private final String soTaiKhoan;
    private final String Pin;
    private int soDu;

    public Banker(Scanner sc) {
        System.out.print("Nhap ID: ");
        this.ID = sc.nextLine();
        System.out.print("Nhap customerID: ");
        this.customerID = sc.nextLine();
        System.out.print("Nhap soTaiKhoan: ");
        this.soTaiKhoan = sc.nextLine();
        System.out.print("Nhap Pin: ");
        this.Pin = sc.nextLine();
        System.out.print("Nhap so du hien co: ");
        this.soDu = sc.nextInt();
    }

    @Override
    public String toString() {
        return "ID: " + this.ID + "\n" + "CustomerID: " + this.customerID + "\n" + "SoTaiKhoan: "
                + this.soTaiKhoan + "\n" + "Pin: " + this.Pin + "\n" + "SoDu: " + this.soDu + "VND";
    }

    //rut tien
    public void withDraw(int soTien) {
        if (this.soDu - 50000 > soTien) {
            this.soDu -= soTien;
        }
    }

    //nap tien
    public void deposit(int soTien) {
        this.soDu += soTien;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
}
