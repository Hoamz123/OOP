package DiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//so hoc sinh
        List<hocSinh> listHS = new ArrayList<>();//chua danh sach hoc sinh
        while(n-->0){
            sc.nextLine();
            listHS.add(new hocSinh(sc));//them hoc sinh moi vao listHS
        }
        //sort
        Collections.sort(listHS);// ben kia viet ham chi dinh xap xep roi
        for(hocSinh x: listHS){
            System.out.println(x);
        }
    }
}
