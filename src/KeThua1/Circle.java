package KeThua1;
//hinh tron
public class Circle {
    private double radius;//ban kinh
    private String color;//mau sac

    //constructor
    public Circle(){

    }
    public Circle (String color,double radius){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "COLOR : " + this.color;
    }
}
