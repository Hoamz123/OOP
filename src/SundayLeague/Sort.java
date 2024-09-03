package SundayLeague;

import java.util.Comparator;

public class Sort implements Comparator<DoiBong> {
    @Override
    public int compare(DoiBong o1, DoiBong o2) {
        //diem giam dam
        if(o1.getDiemSo() != o2.getDiemSo()){
            return o2.getDiemSo() - o1.getDiemSo();
        }
        else if(o1.getHieuSo()!=o2.getHieuSo()){
            return o2.getHieuSo() - o1.getHieuSo();
        }
        else {
            return o2.getSoTranDaDau() - o1.getSoTranDaDau();
        }
    }
}
