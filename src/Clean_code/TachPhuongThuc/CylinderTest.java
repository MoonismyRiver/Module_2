package Clean_code.TachPhuongThuc;

public class CylinderTest {

    public static void main(String[] args) {
        System.out.println("Testing getVolume(0, 0)");
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        System.out.println(expected+"--"+result);
    }
}
