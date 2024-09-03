package SortTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<time> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            time t = new time(sc);
            list.add(t);
        }
        list.sort(new sortByTime());
        for(time x: list){
            System.out.println(x);
        }
    }
}
