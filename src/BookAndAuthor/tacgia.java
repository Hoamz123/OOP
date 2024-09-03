package BookAndAuthor;

import java.util.Scanner;

public class tacgia {
    private final String name;
    private final String email;
    private final char gender;

    public tacgia(Scanner sc) {
        name = sc.nextLine();
        email = sc.nextLine();
        gender = sc.next().charAt(0);
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.email + "\n" + this.gender ;
    }
}
