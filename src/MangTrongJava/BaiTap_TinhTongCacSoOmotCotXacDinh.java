package MangTrongJava;

import java.util.Scanner;

public class BaiTap_TinhTongCacSoOmotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][2];

        System.out.println("Nhập " + matrix.length + " hàng and " +
                matrix[0].length + " cột : ");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Nhập hàng " + (row + 1) + " : ");
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();

            }

        }
        System.out.printf("Danh sách các phần tử : " + "\n");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf(matrix[row][column] + "\t");
            }
            System.out.printf("\n");
        }
        int a;
        do {
            System.out.println("Nhập cột cần tính tổng : ");
            a = scanner.nextInt();
        } while (a < 0 || a > matrix[0].length);
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][a - 1];
        }
        System.out.println("Tổng của cột " + a + " là :" + sum);
    }
}
