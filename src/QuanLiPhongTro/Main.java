package QuanLiPhongTro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiPhongTro quanLiPhongTro = new QuanLiPhongTro();
        QuanLiKhachHang quanLiKhachHang = new QuanLiKhachHang();
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice != 0) {
        System.out.println("Menu");
        System.out.println("1. Tạo phòng mới.");
        System.out.println("2. Tạo Khách Hàng mới.");
        System.out.println("3. Hiển Thị Các Phòng ( theo giá.");
        System.out.println("4. Hiển thị khách hàng.");
        System.out.println("5. Tìm kiếm khách hàng theo tên.");


            switch (choice) {
                case 1:
                    quanLiPhongTro.taophongmoi();
                    break;
                case 2:
                    quanLiKhachHang.taoKhachHangMoi();
                    break;
                case 3:
                    quanLiPhongTro.showPhong();
                    break;
                case 4:
                    System.out.println("1.Theo id");
                    System.out.println("2.Theo năm sinh");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:

                            break;

                        case 2:

                            break;
                        default:
                            System.out.println("nhập lại lựa chọn !");
                    }
                case 5:
                    quanLiKhachHang.timTheoId();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
}

