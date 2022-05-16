package KeThua.LopPoint2DVaLopPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z=0.0f;
    private float[] arrOfXYZ ={getX(),getY(),z};
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getArrOfXYZ() {
        return arrOfXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", arrOfXYZ=" + Arrays.toString(arrOfXYZ) +
                '}';
    }
}
