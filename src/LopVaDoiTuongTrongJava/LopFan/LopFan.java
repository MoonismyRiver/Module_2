package LopVaDoiTuongTrongJava.LopFan;

public class LopFan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean check = false;
    public double radius=5;
    private String color="blue";

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    public LopFan toString(speed,radius,color){
//        this.speed=speed;
//        this.radius=radius
//
//
//    }
}
