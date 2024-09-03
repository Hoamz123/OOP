package KeThua2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//so luong sinh vien
        int m = sc.nextInt();//so luong nhan vien
        List<student> listSV = new ArrayList<>();//luu tru sinh vien
        List<staff> listST = new ArrayList<>();//luu tru nhan vien
        sc.nextLine();
        for(int i = 0; i < n; i++){
            sc.nextLine();//doc dong co dau gach chan -----------------
            listSV.add(  new student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextDouble())  );
            sc.nextLine();//xu li troi lenh
        }

        for(int i = 0; i < m; i++){
            sc.nextLine();
            listST.add( new staff(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble()) );
            sc.nextLine();
        }
        sc.nextLine();
    //sort
        Collections.sort(listSV);
        Collections.sort(listST);
        //thong tin nhan vien
        System.out.println("Staff List");
        for(staff s : listST){
            System.out.println("----------------------");
            System.out.println(s);
        }
        //thong tin sinh vien
        System.out.println("\nStudent List");
        for(student s : listSV){
            System.out.println("----------------------");
            System.out.println(s);
        }
    }
}
/*
input

3 4
-------------------------
dinh van hoa
thai binh
CNTT
2
6000000
-------------------------
tran van A
hung ha
CNTT
3
2000000
-------------------------
tran van hoa
hung ha
CNTT1
4
2000000
-------------------------
dinh van A
thai binh
Harvard
1500000
-------------------------
tran thi linh
thai dui
KMA
5000000
------------------------
tran thao linh
thai binh
KKK
500000
------------------------
Nguyen dieu linh
hung ha
HUST
2000000
------------------------

 */

/*
output

 */