package DiemHocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hocSinh implements Comparable<hocSinh>{
    private static int cnt;
    private final String maHocSinh;
    private final String tenHocSinh;
    private final List<Float> list;
    private String xepLoai;//nho cap phat truoc khi dung

    //constructor
    public hocSinh(Scanner sc) {
        list = new ArrayList<Float>();
        cnt++;
        this.maHocSinh = "HS0" + String.valueOf(cnt);
        this.tenHocSinh = sc.nextLine();
        for(int i=0;i<3;i++){
            this.list.add(sc.nextFloat());
        }
    }

    public float getDiemTB(){
        float sum = 0;
        for(float x: this.list){
            sum += x;
        }
        return sum / 3;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setXepLoai() {
        if(this.getDiemTB() >= 9){
            this.xepLoai = "Xuat Xac";
        }
        else if(getDiemTB() >= 8){
            this.xepLoai = "Gioi";
        }
        else if(getDiemTB() >= 7){
            this.xepLoai = "Kha";
        }
        else if(getDiemTB() >= 5){
            this.xepLoai = "Trung Binh";
        }
        else this.xepLoai = "Yeu";
    }

  @Override
    public int compareTo(hocSinh o) {
        if (this.getDiemTB() > o.getDiemTB()) {
             return -1;// this dung truoc
        }
        else if(this.getDiemTB() < o.getDiemTB()) {
            return 1;// this dung sau
        }
        return 0;
    }

    @Override
    public String toString() {
        setXepLoai();
        return this.maHocSinh + " " + this.tenHocSinh + " " + String.format("%.1f",this.getDiemTB())+ " " + this.xepLoai;
    }
}
