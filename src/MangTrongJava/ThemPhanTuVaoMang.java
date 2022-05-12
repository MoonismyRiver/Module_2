package MangTrongJava;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arr[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Thêm vào mảng phần tử :");
        int a = scanner.nextInt();
        int index;
        do {
            System.out.println("ở vị trí thứ :");
            index = scanner.nextInt();
        } while ((index < 1) || (index > (arr.length+1)) );
        int newarr[] = new int[n + 1];
        for (int i = 0; i < index - 1; i++) {
            newarr[i] = arr[i];
        }
        newarr[index - 1] = a;
        for (int i = (index); i < newarr.length; i++) {
            newarr[i] = arr[i - 1];
        }


        System.out.println("Mảng sau khi thêm phần tử " + a + " tại vị trí thứ " + index + " là: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + "\t");
        }
    }
}

