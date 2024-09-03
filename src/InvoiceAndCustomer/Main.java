package InvoiceAndCustomer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();//troi lenh
        ArrayList<Invoice> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            list.add(new Invoice(sc.nextInt(),new Customer(sc),sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(list);
        for(Invoice i:list){
            System.out.println(i);
        }
    }
}
/*
input
3
----------------
10001
123
dinh van hoa
30
3000000
----------------
10002
124
tran dieu linh
35
4000000
----------------
10005
125
tran khanh linh
20
1000000
 */
