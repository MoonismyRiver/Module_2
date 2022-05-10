package VongLap;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số thứ nhất : ");
        double a = input.nextDouble();
        System.out.println("nhập số thứ hai : ");
        double b = input.nextDouble();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất !");
        }else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước số chung lớn nhất là : " + a);
        }
    }
}
