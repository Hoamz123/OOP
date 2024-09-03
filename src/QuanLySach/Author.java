package QuanLySach;

import java.util.Scanner;

public class Author {
    private final String name;
    private final String email;
    private final char gender;

    //constructor
    public Author(Scanner sc) {
        sc.nextLine();
        this.name =sc.nextLine();
        this.email = sc.nextLine();
        this.gender = sc.next().charAt(0);//nhap ki tu
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.name +  "\n" + this.email + "\n" + this.gender + "\n";
    }
}
