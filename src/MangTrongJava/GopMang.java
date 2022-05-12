package MangTrongJava;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int n1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng 1 : ");
            n1 = scanner.nextInt();
        } while (n1 <= 0);

        int arr1[] = new int[n1];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }

        int n2;

        do {
            System.out.println("Nhập vào số phần tử của mảng 2 : ");
            n2 = scanner.nextInt();
        } while (n2 <= 0);

        int arr2[] = new int[n2];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        int newarr[]=new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newarr[i] = arr1[i];
        }

        for (int i= arr1.length; i < newarr.length; i++) {
            newarr[i] = arr2[i- arr1.length];
        }
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + "\t");
        }
    }
}
