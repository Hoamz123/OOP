package Luongnhanvien;
import java. util.*;
public class sortByIncome implements Comparator<nhanVien>{
    @Override
    public int compare(nhanVien o1, nhanVien o2) {
        if(o1.tongThuNhap() > o2.tongThuNhap()){
            return -1;
        }
        else return 0;
    }
}
