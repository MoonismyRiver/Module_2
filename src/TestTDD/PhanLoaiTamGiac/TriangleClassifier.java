package TestTDD.PhanLoaiTamGiac;

public class TriangleClassifier {
    public String creatTriangle(double a, double b, double c){
        boolean Triangle = a+b>=c && a+c>b && b+c > a && a > 0 && b >0 && c > 0;
        if (Triangle){
            if (a == b && b == c){
                return "this is a equilateral triangle";
            } else if (a == b || a == c || b == c){
                return "this is a isosceles triangle";
            } else {
                return "this is a normal triangle";
            }
        } else {
            return "this isn't a Triangle";
        }
    }
}
