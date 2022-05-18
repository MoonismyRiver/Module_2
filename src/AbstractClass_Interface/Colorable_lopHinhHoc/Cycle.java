package AbstractClass_Interface.Resizeable_lopHinhHoc;

import KeThua.ThucHanh_HeDoiTuongHinhHoc.Shape;

public class Cycle extends Shape {
    private  double radius=1.0;

    public Cycle() {

    };

    public Cycle(double radius) {
        this.radius = radius;
    }

    public Cycle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
