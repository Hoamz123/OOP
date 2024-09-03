package TuyenSinh;
import java.util.*;
public class thiSinh {
    private final String maThiSinh;
    private final String tenThiSinh;
    private final float diemToan;
    private final float diemLy;
    private final float diemHoa;
    private String trangThai;
    public thiSinh(Scanner sc) {
        this.maThiSinh = sc.nextLine();
        this.tenThiSinh = sc.nextLine();
        this.diemToan = sc.nextFloat();
        this.diemLy = sc.nextFloat();
        this.diemHoa = sc.nextFloat();
    }

    //lay khu vuc (3 chu  cai dau)
    public String khuVuc() {
        return this.maThiSinh.substring(0,3);
        //tra ve khu vuc (vd KV1) cua thi sinh
    }

    //tinh tong diem(ca uu tien)
    public float tongDiem(){
        float sumPoint = this.diemToan + this.diemLy + this.diemHoa;
        if(this.khuVuc().equals("KV1")){
            return sumPoint + (float)0.5;
        }
        else if(this.khuVuc().equals("KV2")){
            return sumPoint + (float)1.0;
        }
        else return sumPoint + (float)2.5;
    }

    public String formatPoint(){
        setTrangThai();
        if((int) this.tongDiem() == this.tongDiem()) {
            return String.valueOf((int)this.tongDiem());
        }
        else {
            return String.valueOf(this.tongDiem());
        }
    }

    //set trang thai do hay truot > 24   = do
    public void setTrangThai() {
        if(this.tongDiem() >= 24){
            this.trangThai = "Pass";
        }else this.trangThai = "False";
    }
    @Override
    public String toString() {
        return this.maThiSinh + " " + this.tenThiSinh + " " + this.khuVuc().charAt(2)
                +  " " + this.formatPoint() + " " + this.trangThai;
    }
}
