package MangTrongJava;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Độ F sang độ C ");
            System.out.println("2.Độ C sang độ F");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if(choice!=1||choice!=0||choice!=2){
                System.out.println("không có lựa chọn ấy !");
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị độ F : ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F sang độ C :" + doFsangdoC(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C sang độ F : " + doCsangdoF(celsius));
                    break;

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double doFsangdoC(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double doCsangdoF(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
