package KeThua1;
//hinh tru
public class Cylinder extends Circle implements Comparable<Cylinder>{
    private double height;//chieu cao

    public Cylinder(String color,double radius,double height){
        super(color, radius);//goi ham constructor cua cha no
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //tinh the tich hinh tru (Cylinder)
    public double getVolume(){
        double pi = 3.14;
        return this.getRadius() * this.getRadius() * pi * this.height;
    }

    @Override
    public int compareTo(Cylinder o) {
        if(this.getVolume() != o.getVolume()){
            if(this.getVolume() > o.getVolume()){
                return -1;
            }
            else return 1;
        }
        else{
            //the tinh bang nhau
            return this.getColor().compareTo(o.getColor());
        }
    }
    //to string

    @Override
    public String toString() {
        return super.toString() + "\n" + "HEIGHT : " + String.format("%.2f",this.height )+ "\n" + "RADIUS : "
                + String.format("%.2f",this.getRadius()) + "\n" + "VOLUME : " + String.format("%.2f",this.getVolume());
    }
}
