package KeThua.LopPointVaMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    private float[] arrOfXY = {getX(), getY()};

    public void setY(float y) {
        this.y = y;
    }

    public void setArrOfXY() {
        this.arrOfXY[0] = getX();
        this.arrOfXY[1]=getY();
    }

    public float[] getXY() {
        return arrOfXY;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", arrOfXY=" + Arrays.toString(arrOfXY) +
                '}';
    }
}
