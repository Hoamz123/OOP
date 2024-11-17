package OOP_17_11;

public class Vector {
    private int x;
    private int y;

    Vector() {}

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //cong hai vector
    public Vector addTwoVector(Vector v) {
        return new Vector(x + v.getX(), y + v.getY());
    }

    public Vector subtractVector(Vector v) {
        return new Vector(x - v.getX(), y - v.getY());
    }

    public Vector multiplyVector(Vector v) {
        return new Vector(x * v.getX(), y * v.getY());
    }

    @Override
    public String toString() {
        return this.x + "   " + this.y;
    }
}
