package QuanLyTaiKhoan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Account> list = new ArrayList<Account>();
        for (int i = 0; i < n; i++) {
            list.add(new Account(sc));
        }

        //Q truy van
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0) {
            String username = sc.nextLine();
            String password = sc.nextLine();
            for(Account a : list) {
                if(a.checkLogin(username, password)) {
                    System.out.println("Login successful");
                    break;
                }
                else {
                    System.out.println("Login failed");
                    break;
                }
            }
        }

    }
}
