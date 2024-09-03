package KeThua1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Cylinder> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();//trong choi lenh
            list.add(new Cylinder(sc.next(),sc.nextDouble(),sc.nextDouble()));//theo thu tu mau sac - ban kinh  - chieu cao
        }
        Collections.sort(list);//da viet ham compareTo be Cylinder

        for(Cylinder c:list){
            System.out.println(c);
            System.out.println("-----------------------");
        }//
    }
}
