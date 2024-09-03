package GiaiCuuCongChua;

import java.util.Scanner;

public class HoangTu {
    private int Power;//suc manh hoangtu
    private int Blood;//chi so mau cua no
    private String alive;//song hay chet

    public HoangTu(Scanner sc) {
        String s = sc.nextLine();
        this.Power = Integer.parseInt(s.substring(8));//doi tu xau sang so
        String x = sc.nextLine();
        this.Blood = Integer.parseInt(x.substring(8));//troi lenh o day
        this.alive = sc.nextLine();
    }

    public void setBlood(int blood) {
        Blood = blood;
    }

    public void setPower(int power) {
        Power = power;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        //khi nao HT chet thi goi ham set->dead
        this.alive = alive;
    }

    //TH gap nam doc
    public void mushroom() {
        if(this.alive.equals("ALIVE")){
            setBlood(this.Blood - 15);
            setPower(this.Power - 2);
            if(this.Blood <= 0 || this.Power <= 0) {
                this.Blood = 0;
                this.Power = 0;
                setAlive("DEAD");
            }
        }

    }
    //TH gap phu thuy
    public void witch(int sucManhPhuThuy){
        if(this.alive.equals("ALIVE")){
            if(sucManhPhuThuy >= this.Power){
                setBlood(0);
                setPower(0);
                setAlive("DEAD");
            }
            else{
                setPower(this.Power + 5);
                //van song
            }
        }

    }
    //TH gap dau than(pea)
    public void pea(){
        if(this.alive.equals("ALIVE")){
            if(this.Blood > 0 && this.Power > 0){
                setBlood(this.Blood + 10);
                setPower(this.Power + 2);
            }
            //van song
        }

    }

    //TH gap quan linh(soldier)
    public void soldier(int sucManhQuanLinh){
        if(this.alive.equals("ALIVE")){
            if(sucManhQuanLinh >= this.Power){
                //hoang tu chet
                setBlood(0);
                setPower(0);
                setAlive("DEAD");
            }
            else{
                setPower(this.Power + 7);
                setBlood(this.Blood + 5);
                //van song (alive = ALIVE)
            }
        }

    }

    @Override
    public String toString() {
        return "\nPOWER: " + Power + "\nBLOOD: " + Blood + "\n" + this.alive + "\n---------------------------";
    }
}
