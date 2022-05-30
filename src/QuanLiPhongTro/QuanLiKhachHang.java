package QuanLiPhongTro;

import java.util.Scanner;

public class QuanLiKhachHang {
    Scanner scanner = new Scanner(System.in);
    PhongTro phongtro = new PhongTro();

    public void taoKhachHangMoi() {
        System.out.println("nhập tên : ");
        String loaiphongtro = scanner.nextLine();

        System.out.println("nhập số cmnd: ");
        int giatien = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập địa chỉ: ");
        String diachi = scanner.nextLine();
        PhongTro phongTro = new PhongTro(loaiphongtro, giatien, diachi);
    }
    public void timTheoId() {
        System.out.println("Nhập số cmnd :");
        int id = Integer.parseInt(scanner.nextLine());
    }

}
