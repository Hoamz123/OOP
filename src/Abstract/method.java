package Abstract;

public abstract class method {
    private final String Color;

    //constructor
    public method(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    //phuong thuc ao

    //tinh dien tich
    public abstract String DienTich();

    //tinh chu vi
    public abstract String ChuVi();
}
