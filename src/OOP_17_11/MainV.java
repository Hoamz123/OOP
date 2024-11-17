package OOP_17_11;

public class MainV {
    public static void main(String[] args) {
        Vector x = new Vector(1,2);
        Vector y = new Vector(3,4);
        Vector z = y.addTwoVector(x);//tong hai vector
        Vector t = y.subtractVector(x);//vector y - vector x
        Vector m = y.multiplyVector(x);//vector y nhan vector x
        System.out.println(z);
        System.out.println(t);
        System.out.println(m);


    }
}
