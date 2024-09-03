package Abstract;

public class Hinh extends method{
    private double radius;//ban kinh hinh tron

    public Hinh(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String DienTich() {
        return String.format("%.2f",this.radius * this.radius * 3.14);
    }

    @Override
    public String ChuVi() {
        return String.format("%.2f",2 * this.radius * 3.14);
    }
}
