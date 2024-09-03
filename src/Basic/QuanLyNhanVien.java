package Basic;

import java.util.Scanner;

class qlnv{
    public static class QuanLyNhanVien {
        private static int msv;
        private String ID;
        private String nameNV;
        private String sex;
        private String address;
        private String date;
        private String mst;
        private String ngayKiHD;

        //constructor
        QuanLyNhanVien(Scanner sc) {
            msv++;
            ID = String.format("%05d", msv);//vi du 00001
            nameNV = sc.nextLine();
            sex = sc.nextLine();
            address = sc.nextLine();
            date = sc.nextLine();
            mst = sc.nextLine();
            ngayKiHD = sc.nextLine();
        }
        //in ra danh sach theo ngay ki hop dong som nhat -> muon nhat

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return ID + " " + nameNV + " " + sex + " " + address + " " + date + " " + mst + " " + ngayKiHD;


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien nhanVien = new QuanLyNhanVien(sc);
        System.out.println(nhanVien.toString());
    }
}
