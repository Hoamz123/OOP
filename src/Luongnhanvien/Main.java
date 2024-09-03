package Luongnhanvien;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<nhanVien> list = new ArrayList<nhanVien>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//so luong nhan vien
        sc.nextLine();
        for(int i=0;i<n;i++){
            list.add(new nhanVien(sc));
        }
        list.sort(new sortByIncome());
        //in ra man hinh
        for(nhanVien v : list){
            System.out.println(v.toString());
        }
    }
}
