package SundayLeague;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoiBong> list = new ArrayList<>();
        for(int i=0;i<4;i++){
            sc.nextLine();
            DoiBong a = new DoiBong(sc);
            sc.nextLine();
            list.add(a);
            sc.nextLine();
        }

        for(int i=0;i<2;i++){
            String doi1 = "";
            String doi2 = "";
            int t1 = 0;
            int t2 = 0;
            String s = sc.nextLine();
            String [] ss = s.split("\\s+");
            int pos = 0;
            for(int k=0;k<ss.length;k++){
                if(ss[k].equals("-")){
                    pos = k;
                }
            }
            t1 = Integer.parseInt(ss[pos - 1]);
            t2 = Integer.parseInt(ss[pos + 1]);

            for(int k=0;k<pos -1;k++){
                doi1 += ss[k] + " ";
            }
            doi1 = doi1.trim();
            for(int k=pos + 2;k<ss.length;k++){
                doi2 += ss[k] + " ";
            }
            doi2 = doi2.trim();
            for(DoiBong x : list){
                if(x.getTenDoiBong().equals(doi1)){
                    x.setSoTranDaDau(x.getSoTranDaDau() + 1);
                    x.setHieuSo(x.getHieuSo() + (t1 - t2));
                    if(t1 > t2){
                        x.setDiemSo(x.getDiemSo() + 3);
                    }
                }
                if(x.getTenDoiBong().equals(doi2)){
                    x.setSoTranDaDau(x.getSoTranDaDau() + 1);
                    x.setHieuSo(x.getHieuSo() + (t2 - t1));
                    if(t2 > t1){
                        x.setDiemSo(x.getDiemSo() + 3);
                    }
                }
            }
        }

        list.sort(new Sort());
        int stt = 0;
        for(DoiBong x : list){
            stt++;
            System.out.println("#" + (stt) + " " + x);
            System.out.println("----------------------");
        }
    }
//tha di 1h dem roi :((((
}
/*
#1
MU
ManU
20 4 30
-----------------
#2
MC
ManC
20 6 34
-----------------
#3
Che
Chelsea
19 -4 28
-----------------
#4
LIV
Liverpool
21 14 38
-----------------
Chelsea 3 - 4 Liverpool
ManU 2 - 1 ManC

 */