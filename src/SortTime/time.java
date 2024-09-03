package SortTime;

import java.util.Scanner;

public class time {
    private int hour;
    private int minute;
    private int second;

    public time(Scanner sc) {
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        if(hour < 100){
            this.hour = hour;
        }
        if(minute < 60){
            this.minute = minute;
        }
        if(second < 60){
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return this.hour + " " + this.minute + " " + this.second;
    }

    public int tongGiay(){
        return (this.hour * 3600) + this.minute * 60 + this.second;
    }
}
