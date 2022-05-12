package LopVaDoiTuongTrongJava.PhuongTrinhBacHai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2 : ");
        System.out.println("Nhập vào hệ số  bậc 2 : ");
        double a = input.nextDouble();
        System.out.println("Nhập vào hệ số  bậc 1 : ");
        double b = input.nextDouble();
        ;
        System.out.println("Nhập vào hằng số : ");
        double c = input.nextDouble();
        PhuongTrinhBacHai vidu1 = new PhuongTrinhBacHai(a, b, c);
        System.out.println("delta là : " + vidu1.tinhDelta());
        if (vidu1.tinhDelta() < 0) {
            System.out.println("Phương trình vô nghiệm!");
        }
        if (vidu1.tinhDelta() == 0) {
            System.out.println("Phương trình có 1 nghiệm là : " +vidu1.nghiem1());
        }
        if (vidu1.tinhDelta() > 0) {
            System.out.println("Nghiệm thứ nhất là : " + vidu1.nghiem1());
            System.out.println("Nghiệm thứ hai là : " + vidu1.nghiem2());

        }

    }
}
