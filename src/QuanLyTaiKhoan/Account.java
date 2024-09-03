package QuanLyTaiKhoan;

import java.util.Scanner;

public class Account {
    private String ID;
    private String customerID;
    private final String username;
    private final String password;

    public Account(Scanner sc) {
        this.ID = sc.nextLine();
        this.customerID = sc.nextLine();
        this.username = sc.nextLine();
        this.password = sc.nextLine();
    }

    public boolean checkLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
