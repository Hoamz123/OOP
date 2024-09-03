package BookAndAuthor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//so luong dau sach
        List<sach> list = new ArrayList<>();//chua thong tin n quyen sach
        for (int i = 0; i < n; i++) {
            sc.nextLine();//troi lenh
            String nameBook = sc.nextLine();//ten sach
            int priceBook = sc.nextInt();//gia tien
            int qty = sc.nextInt();//so luong
            List<tacgia> authors = new ArrayList<>();//mang chua tt cua cac tac gia
            int q = sc.nextInt();//so luong tac gia trong sach
            for (int j = 0; j < q; j++) {
                sc.nextLine();//troi lenh
                authors.add(new tacgia(sc));//them cac tac gia moi vao list
            }
            list.add(new sach(nameBook, priceBook, qty, authors));
        }
        list.sort(new sortByName());
        int sttSach = 0;
        for(sach a: list){
            sttSach++;
            System.out.println("#" + sttSach + "\n" + a.toString());
            int sttTG = 0;
            for(tacgia x: a.getTg()){
                sttTG++;
                System.out.println("#" + sttTG + "\n" + x.toString());
            }
            System.out.println("---------------------");
        }
    }
}
/*
input:
2
con chut gi de nho
25000
1000
1
nguyen nhat anh
anh@gmail.com
m
cay cam ngot cua toi
50000
100
2
nguyen nhat anh
anh@gmail.com
m
dinh van hoa
hoaf@gmail.com
f
 */
/*

output:
#1
Book Information:
cay cam ngot cua toi
50000
100
----------------
Author Information
#1
nguyen nhat anh
anh@gmail.com
m
#2
dinh van hoa
hoaf@gmail.com
f
---------------------
#2
Book Information:
con chut gi de nho
25000
1000
----------------
Author Information
#1
nguyen nhat anh
anh@gmail.com
m
---------------------
 */