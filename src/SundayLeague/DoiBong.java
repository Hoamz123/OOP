package SundayLeague;

import java.util.Scanner;

public class DoiBong {
    private final String maDoiBong;
    private final String tenDoiBong;
    private int soTranDaDau;
    private int diemSo;
    private int hieuSo;

    public DoiBong(Scanner sc){
        //System.out.print("Ma doi bong: ");
        this.maDoiBong = sc.nextLine();
        //System.out.print("Ten doi bong: ");
        this.tenDoiBong = sc.nextLine();
        //System.out.print("So tran da dau: ");
        this.soTranDaDau = sc.nextInt();
        //System.out.print("Hieu So: ");
        this.hieuSo = sc.nextInt();
        //System.out.print("Diem So: ");
        this.diemSo = sc.nextInt();

    }

    public int getDiemSo() {
        return diemSo;
    }

    public int getHieuSo() {
        return hieuSo;
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }

    public void setHieuSo(int hieuSo) {
        this.hieuSo = hieuSo;
    }

    public void setSoTranDaDau(int soTranDaDau) {
        this.soTranDaDau = soTranDaDau;
    }

    public int getSoTranDaDau() {
        return soTranDaDau;
    }

    @Override
    public String toString() {
        return this.maDoiBong + " " + this.tenDoiBong + " " + this.soTranDaDau + " " + this.hieuSo + " " + this.diemSo;
    }
}
