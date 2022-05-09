package GioiThieuJava;

import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên bạn : ");
        String name = scanner.nextLine();
        System.out.println("Chào bạn " + name);
    }
}
