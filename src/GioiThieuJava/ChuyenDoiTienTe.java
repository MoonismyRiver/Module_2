package GioiThieuJava;

import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Bạn hãy nhập số USD cần quy đổi : ");
        double usd ;
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Giá trị sau quy đổi : " + quydoi + "VNĐ");
    }
}
