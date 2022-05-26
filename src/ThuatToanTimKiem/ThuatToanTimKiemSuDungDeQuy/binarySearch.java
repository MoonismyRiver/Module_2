package ThuatToanTimKiem.ThuatToanTimKiemSuDungDeQuy;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap so phan tu cua mang : ");
            n = scanner.nextInt();
        } while (n < 0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu co index " + i + " cua mang");
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap gia tri can tim kiem : ");
        int value = scanner.nextInt();
        if (binarySearch(arr, 0, arr.length - 1, value)==-1){
            System.out.println("khongg thay !");}else
        System.out.println("phan tu tim thay o vi tri : " + binarySearch(arr, 0, arr.length - 1, value));
    }

    /* su dung de quy */
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value)
            return middle;
        else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else return binarySearch(array, left, middle - 1, value);
    }

}

