package QuanLySach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();//chong troi lenh
            list.add(new Book(sc.nextLine(), sc.nextDouble(), sc.nextInt(), new Author(sc)));
        }
        Collections.sort(list);//sort theo ham da viet

        //in ra du lieu
        for(Book x: list){
            System.out.println(x);
            System.out.println("-----------------------");
        }
    }
}
