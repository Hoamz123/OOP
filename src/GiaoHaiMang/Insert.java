package GiaoHaiMang;
import java.util.*;
public class Insert {
    private final TreeSet<Integer> set;//khi khoi tao constructor phai cap phat cho set

    //constructor
    public Insert() {
        set = new TreeSet<>();
    }

    //cstor
    public Insert(int[] a){
        set = new TreeSet<> ();
        for(int x: a){
            set.add(x);
        }
    }

    //intersection
    public Insert intersection(Insert b){
        Insert result = new Insert();//khoi tao ket qua
        //duyet tren set this
        for(int x: this.set){
            if(b.set.contains(x)){
                result.set.add(x);
            }
        }
        return result;
    }


    //Hop cua hai mang
    public Insert hop(Insert b){
        Insert result = new Insert();
        result.set.addAll(this.set);//them tat ca cac thanh phan trong this.set vao result.set
        //duyet b.set neu phan tu nao chua co trong result.set thi them vao -> hop cua 2 mang
        for(int x : b.set){
             // if x chua ton tai trong result.set
            if (result.set.contains(x)) {
                continue;
            }
            result.set.add(x);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int x: this.set){
            res.append(x).append(" ");
        }
        return res.toString();
    }
}