package hocsinh;

import java.util.Scanner;

public class hocsinh {
    private int id;
    private String name;
    public hocsinh(Scanner sc) {
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "hocsinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
