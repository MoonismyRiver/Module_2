package VongLap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng các số nguyên tố cần in ra : ");
        int number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            int i = 2;
            boolean check = true;
            while (i < N) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;

            }

            if (check) {
                System.out.println(N + " ");
                count++;
                N++;
            } else {
                N++;
            }
            ;

        }
    }
}

