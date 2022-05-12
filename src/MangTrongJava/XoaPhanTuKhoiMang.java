package MangTrongJava;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int i,c;
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9};
        System.out.println("Nhập phần tử muốn xóa : ");
        int X = input.nextInt();
        for ( c= i = 0; i < arr.length ; i++) {
            if (arr[i] != X) {
                arr[c] = arr[i];
                c++;
            }
        }
        System.out.println("Mảng sau khi xóa phần tử "+X+" là :");
        for (int j = 0; j < c; j++) {
            System.out.printf( arr[j]+"\t");
        }

    }
}
