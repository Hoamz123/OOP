package KeThua2;

public class staff extends Person implements Comparable<staff>{
    private String school;//ten truong lam  viec
    private double pay;//luong

    public staff(String name,String address,String school, double pay) {
        super(name,address);
        this.school=school;
        this.pay=pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString() + "School: " + school + "\n" + "Pay: " + String.format("%.2f",pay) + "$";
    }

    @Override
    public int compareTo(staff o) {
       //CASE : luong khac nhau
        if(this.pay != o.getPay()){
            if(this.pay>o.getPay()){
                return 1;
            }
            else return -1;
        }
        else{
            return this.getName().compareTo(o.getName());//ten tang dan theo thu tu tu dien
        }
    }
}
