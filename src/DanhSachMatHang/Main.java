package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();sc.nextLine();
        List<MatHang> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(new MatHang(sc));
        }
        Collections.sort(list);
        for(MatHang matHang : list){
            System.out.println(matHang);
        }
    }
}
