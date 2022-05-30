package LopVaDoiTuongTrongJava.LopFan;

public class LopFan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean check = false;
    public double radius = 5;
    private String color = "blue";

    public LopFan() {
    }

    public LopFan(int speed, boolean check, double radius, String color) {
        this.speed = speed;
        this.check = check;
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
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

    @Override
    public String toString() {
        if (check) {
            return "LopFan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +"'"+
                    ", fan is on" + '\'' +
                    '}';
        } else {
            return "LopFan{" +
                    ", radius=" + radius +
                    ", color='" + color +"'"+
                    ", fan is off" + '\'' +
                    '}';
        }
    }


}
