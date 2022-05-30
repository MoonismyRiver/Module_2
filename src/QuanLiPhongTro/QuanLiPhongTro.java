package QuanLiPhongTro;

import LopVaDoiTuongTrongJava.QuanLiNhanVienDemo.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiPhongTro {
    ArrayList arrayList1 = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    PhongTro phongtro = new PhongTro();

    public void taophongmoi() {
        System.out.println("nhập loại phòng trọ : ");
        String loaiphongtro = scanner.nextLine();

        System.out.println("nhập giá tiền: ");
        int giatien = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập địa chỉ: ");
        String diachi = scanner.nextLine();

    }
    public void showPhong() {
        System.out.println();


    }


}
