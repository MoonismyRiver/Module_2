package MangTrongJava;

import java.util.Scanner;

public class BaiTap_Mang2Chieu_TinhTongCacSoOduongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];

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
        int sum =0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }

        System.out.println("Tổng của đường chéo chính là :" + sum);
    }
}



