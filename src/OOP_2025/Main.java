package OOP_2025;

import java.util.Scanner;

@FunctionalInterface
interface onClick{
    void onClickButton();
}

public class Main {
    public static void main(String[] args) {
        onClick onClick = () -> System.out.println("Hoa");
        onClick.onClickButton();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        int a = sc.nextInt();
        System.out.println(a);
    }
}
