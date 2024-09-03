package GiaiCuuCongChua;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoangTu a = new HoangTu(sc);//nhap du lieu trong constructor
        //nhap truy van(so truong ngai vat)
        int q = sc.nextInt();sc.nextLine();
        for(int i=0;i<q;i++){//duyet tren q truy van
            String s = sc.nextLine();//ten chuong ngai vat
            if(s.equals("mushroom")){
                a.mushroom();
            }
            else if(s.equals("pea")){
                a.pea();
            }
            else if(s.charAt(0) == 'w'){
                int sucManhPhuThuy = Integer.parseInt(s.substring(6));// witch 10
                a.witch(sucManhPhuThuy);
            }
            else{
                int sucManhLinh = Integer.parseInt(s.substring(8));//soldier 50
                //truyen suc manh linh vao
                a.soldier(sucManhLinh);
            }
            System.out.print(a);
        }

    }
}
/*
POWER : 100
BLOOD : 100
ALIVE
6
witch 77
mushroom
pea
pea
soldier 164
soldier 137
 */
