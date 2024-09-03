package AccountCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int ID = sc.nextInt();sc.nextLine();
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        Customer customer = new Customer(ID, name, gender);
        double balance = sc.nextDouble();
        //tao account
        account account = new account(id,customer,balance);
        int q = sc.nextInt();//so thao tac nap va rut
        sc.nextLine();//chong troi lenh
        List<account> accounts = new ArrayList<>();//luu cac bien dong so du sau nhung lan giao dich
        while(q-->0){
            String thaoTac = sc.next();double amount = sc.nextDouble();//so tien can giao dich(nap - rut)

            if(thaoTac.equals("deposit")){
                accounts.add(account.deposit(amount));
            }
            else if(thaoTac.equals("withdraw")){
                accounts.add(account.withdraw(amount));

            }
            sc.nextLine();
        }
        for(account a : accounts){
            System.out.println(a);
            System.out.println("---------------------");
        }
    }
}
/*
123
0001
hoa
m
1000000
2
deposit 2000000
withdraw 1000000
 */
