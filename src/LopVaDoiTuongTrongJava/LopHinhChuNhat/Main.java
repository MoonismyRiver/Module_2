package LopVaDoiTuongTrongJava.LopHinhChuNhat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều cao:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn : \n" + rectangle.display());
        System.out.println("Chu vi : " + rectangle.getPerimeter());
        System.out.println("Diện tích : " + rectangle.getArea());
    }

}

