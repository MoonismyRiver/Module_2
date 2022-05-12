package LopVaDoiTuongTrongJava.PhuongTrinhBacHai;

public class PhuongTrinhBacHai {
    private double a, b, c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public  double tinhDelta() {
        double delta;
        return delta =(b*b)-4*(a*c);
    }
    public double nghiem1(){
        double ng1;
        return ng1=(-b+Math.sqrt(tinhDelta()))/(2*a);
    }
    public double nghiem2(){
        double ng2;
        return ng2=(-b-Math.sqrt(tinhDelta()))/(2*a);
    }
}
