package Abstract;

import KeThua1.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hinh circle = new Hinh(sc.next(),sc.nextDouble());
        System.out.println(circle.DienTich() + " " + circle.ChuVi());
    }
}
