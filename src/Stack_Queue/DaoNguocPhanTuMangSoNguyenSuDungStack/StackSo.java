package Stack_Queue.DaoNguocPhanTuMangSoNguyenSuDungStack;

import java.util.Scanner;
import java.util.Stack;

public class StackSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("----ĐẢO NGƯỢC MẢNG----");
            System.out.println("nhập số phần tử của mảng : ");
            n = scanner.nextInt();

            if (n < 1) {
                System.out.println("nhập số nguyên lớn hơn 0 :");
                n = scanner.nextInt();

            }
            int[] numberArr = new int[n];
            System.out.println("nhập các phần tử của mảng : ");
            for (int i = 0; i < n; i++) {
                numberArr[i] = scanner.nextInt();
            }
            Stack stack = new Stack();
            for (int i = n - 1; i > -1; i--) {
                stack.push(numberArr[i]);
            }
            System.out.println("mảng dảo ngược là : " + stack);
                       System.out.println("----OK----");
            System.out.println();
        }
    }
}
