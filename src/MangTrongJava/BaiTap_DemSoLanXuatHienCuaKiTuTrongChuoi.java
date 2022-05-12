package MangTrongJava;

import java.util.Scanner;

public class BaiTap_DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "HelloEveryBody";
        System.out.println("Nhập kí tự cần tìm :");
        String kitu = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kitu.charAt(0)) {
                count++;
            }
        }
        System.out.println("Số lần kí tự " + kitu + " xuất hiện trong chuỗi là : " + count);
    }

}
