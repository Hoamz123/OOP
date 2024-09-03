package DanhSachMatHang;

import java.util.Scanner;

public class MatHang implements Comparable<MatHang>{
    private static int cnt;
    private String maMatHang;
    private String tenHang;
    private String donVi;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;

    public MatHang(Scanner sc) {
        cnt++;
        this.maMatHang = "MH" + String.format("%05d",cnt);
        System.out.print("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhap don vi: ");
        this.donVi = sc.nextLine();
        System.out.print("Nhap gia mua: ");
        this.giaMua = sc.nextInt();
        System.out.print("Nhap gia ban: ");
        this.giaBan = sc.nextInt();
        sc.nextLine();
        this.loiNhuan = this.giaBan - this.giaMua;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenHang + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.loiNhuan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    @Override
    public int compareTo(MatHang obj) {
        if(this.loiNhuan != obj.loiNhuan) {
            if(this.loiNhuan < obj.loiNhuan) {
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return this.getMaMatHang().compareTo(obj.getMaMatHang());
        }
    }

}
