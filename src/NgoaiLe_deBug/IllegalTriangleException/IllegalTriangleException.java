package NgoaiLe_deBug.IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------CẠNH CỦA TAM GIÁC-----");

        while (true) {
            System.out.println("nhập giá trị các cạnh a ,b ,c  : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            try {
                triangle(a, b, c);
                System.out.println("Ok!");
            } catch (IllegalAccessException e) {
                System.out.println("Không phải cạnh tam giác!");


            }
        }
    }
    public static void triangle(int a, int b, int c) throws IllegalAccessException {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            throw new IllegalAccessException();
        }

    }
}


