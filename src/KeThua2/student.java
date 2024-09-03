package KeThua2;

public class student extends Person implements Comparable<student>{
    private String program;//chuong trinh dao tao
    private int year;// so nam hoc
    private final double fee;//hoc phi

    public student(String name,String address, String program, int year, double fee) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return super.toString() + "Program: " + program + "\n" +  "Year: " + year + "\n" +  "Fee: " + String.format("%.2f",fee) + "VND" ;
    }

    @Override
    public int compareTo(student o) {
        //hoc phi giam dan
        if(this.fee != o.getFee()) {
            if(this.fee > o.getFee()) {
                return -1;
            }
            else return 1;
        }
        else{
            return this.getName().compareTo(o.getName());
        }
    }
}
