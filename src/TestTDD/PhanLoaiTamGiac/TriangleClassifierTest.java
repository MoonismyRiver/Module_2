package TestTDD.PhanLoaiTamGiac;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {
    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle1() {
        double a = 2, b = 2, c = 2;
        String expect = "this is a equilateral triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }

    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle2() {
        double a = 2, b = 2, c = 3;
        String expect = "this is a isosceles triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }

    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle3() {
        double a = 3, b = 4, c = 5;
        String expect = "this is a normal triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }

    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle4() {
        double a = 8, b = 2, c = 3;
        String expect = "this isn't a Triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }

    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle5() {
        double a = -1, b = 2, c = 1;
        String expect = "this isn't a Triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }

    @Test
    @DisplayName("equilateral triangle:")
    public void TesTriangle6() {
        double a = 0, b = 2, c = 2;
        String expect = "this isn't a Triangle";

        TriangleClassifier Triangle = new TriangleClassifier();
        Assertions.assertEquals(expect, Triangle.creatTriangle(a, b, c));

    }
}

