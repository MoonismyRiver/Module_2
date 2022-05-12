package MangTrongJava;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Nhập " + matrix.length + " hàng and " +
                matrix[0].length + " cột : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.printf("Danh sách các phần tử : " + "\n");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf(matrix[row][column] + "\t");
            }
            System.out.printf("\n");
        }
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }

        }
        System.out.println("Giá trị lớn nhất trong mảng là  " + max);
    }
}