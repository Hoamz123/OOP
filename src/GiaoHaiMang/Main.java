package GiaoHaiMang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        //nhap du lieu vao hai mang
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        Insert s1 = new Insert(a);
        Insert s2 = new Insert(b);
        Insert s3 = s1.intersection(s2);
        Insert s4 = s1.hop(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}