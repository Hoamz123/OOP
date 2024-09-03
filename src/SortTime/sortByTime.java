package SortTime;

import java.util.Comparator;

public class sortByTime implements Comparator<time> {
    @Override
    public int compare(time o1, time o2) {
        if(o1.tongGiay() > o2.tongGiay()){
            return 1;
        }
        else if(o1.tongGiay() < o2.tongGiay()){
            return -1;
        }
        return 0;
    }
}
