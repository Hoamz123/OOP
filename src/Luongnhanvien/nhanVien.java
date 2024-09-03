package Luongnhanvien;

import java.util.Scanner;

public class nhanVien {
    private static int cnt;
    private final String mnv;
    private final String name;
    private final int luongCoBan;
    private final int soNgayCong;
    private final String chucVu;


    public nhanVien(Scanner sc) {
        cnt++;//tinh tu 1
        this.mnv = "NV" + String.format("%02d",cnt);
        //nhap ten nhan vien
        System.out.print("Nhap ten nhan vien: ");
        this.name = sc.nextLine();
        System.out.print("Nhap luong co ban cua nhan vien: ");
        this.luongCoBan = sc.nextInt();
        System.out.print("Nhap so ngay cong cua nhan vien: ");
        this.soNgayCong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap chuc vu cua nhan vien: ");
        this.chucVu = sc.nextLine();
    }

    //tinh tien luong
    public int tienLuongThang(){
        return this.luongCoBan * this.soNgayCong;
    }
    //tinh thuong
    public int tienThuong(){
        if(this.soNgayCong >= 25){
            return (int)(0.2 * tienLuongThang());
        }
        else if(this.soNgayCong >= 22){
            return  (int)(0.1 * tienLuongThang());
        }
        else return 0;
    }

    public int getPhuCap(){
        return switch (this.chucVu) {
            case "GD" -> 250000;
            case "PGD" -> 200000;
            case "TP" -> 180000;
            case "NV" -> 150000;
            default -> 0;
        };
    }
    //tinh tong thu nhap
    public int tongThuNhap(){
        return this.tienThuong() + this.tienLuongThang() + this.getPhuCap();
    }

    //xuat du lieu ra

    @Override
    public String toString() {
        return mnv + " " + name + " " + tienLuongThang() + " " + tienThuong() + " " + getPhuCap() + " " + tongThuNhap();
    }
}
