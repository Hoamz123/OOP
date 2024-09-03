package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Banker> list = new ArrayList<>();//list chua n account banker
        //them n tai khoan vao list
        while (n-- > 0) {
            sc.nextLine();
            list.add(new Banker(sc));//cac account banker vao list
        }
        int q = sc.nextInt();//truy van
        while (q-- > 0) {
            sc.nextLine();
            System.out.print("Nhap loai hinh giao dich: ");
            String loaiGiaoDich = sc.nextLine();
            if (loaiGiaoDich.equals("withdraw")) {
                //rut tien
                System.out.print("Nhap so tai khoan: ");
                String soTaiKhoan = sc.next();//dung sc.next() vi stk va tien chung mot hang
                System.out.print("Nhap so tien muon rut: ");
                int tien = sc.nextInt();
                int pos = getPosition(list, soTaiKhoan);//tra ve chi so cua tai khoan can xet trong list
                list.get(pos).withDraw(tien);//tru tien
            }
            if (loaiGiaoDich.equals("deposit")) {
                //nap tien
                System.out.print("Nhap so tai khoan: ");
                String soTaiKhoan = sc.next();
                System.out.print("Nhap so tien muon nap: ");
                int tien = sc.nextInt();
                int pos = getPosition(list, soTaiKhoan);
                list.get(pos).deposit(tien);//them tien vao tai khoan
            }
            if (loaiGiaoDich.equals("transfer")) {
                //chuyen tien
                System.out.print("Nhap so tai khoan nguoi chuyen: ");
                String soTaiKhoanChuyen = sc.next();
                System.out.print("Nhap so tai khoan nguoi nhan: ");
                String soTaiKhoanNhan = sc.next();
                System.out.print("Nhap so tien muon giao dich: ");
                int tien = sc.nextInt();//so tien can chuyen
                int posChuyen = getPosition(list, soTaiKhoanChuyen);//chi so cua account nguoi chuyen trong mang
                int posNhan = getPosition(list, soTaiKhoanNhan);//chi so cua account nguoi nhan trong list
                //tru tien nguoi chuyen
                list.get(posChuyen).withDraw(tien);
                //cong vao tien nguoi nhan
                list.get(posNhan).deposit(tien);
            }
        }
        // xuat du lieu
        for(Banker banker : list) {
            System.out.println("Banker Information");
            System.out.println(banker);
            System.out.println("----------------------------");
        }
    }

    public static int getPosition(List<Banker> list, String soTaiKhoan) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSoTaiKhoan().equals(soTaiKhoan)) {
                return i;//ket thuc ham
            }
        }
        return -1;
    }
}
