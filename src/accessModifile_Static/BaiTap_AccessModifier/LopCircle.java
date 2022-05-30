package accessModifile_Static.BaiTap_AccessModifier;

public class LopCircle {
    private double radius = 1;
    private String color="red";

    public LopCircle() {
    }

    public LopCircle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
