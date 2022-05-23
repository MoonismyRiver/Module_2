package QuanLiPhongTro;

import LopVaDoiTuongTrongJava.QuanLiNhanVienDemo.NhanVien;

import java.util.Scanner;

public class KhachSan {
    Scanner scanner = new Scanner(System.in);
Sta
    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Tạo phòng mới.");
        System.out.println("2. Tạo Khách Hàng mới.");
        System.out.println("3. Hiển Thị Các Phòng.");
        System.out.println("4. Hiển thị khách hàng.");
        System.out.println("5. Tìm kiếm khách hàng theo tên.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                taophongmoi();
                break;
            case 2:
                taokhachhangmoi();
                break;
            case 3:
                showPhong();
                break;
            case 4:
                showKhach();
                break;
            case 5:
                timTheoID();
        }
    }

    public void taophongmoi() {
        System.out.println("nhập số phòng: ");
        int id = Integer.parseInt(scanner.nextLine());

        NhanVien[] newNVs = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNVs[i] = nhanViens[i];
        }
        newNVs[newNVs.length - 1] = new NhanVien(id, name, age, address);
        nhanViens = newNVs;

    }


    public void taokhachhangmoi() {
        System.out.println("Nhập họ và tên :");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh : ");
        String birth = scanner.nextLine();
        System.out.println("nhập số cmnd : ");
        int id = Integer.parseInt(scanner.nextLine());

        nhanViens[index] = new NhanVien(id, name, age, address);
    }

    public void showPhong() {
        System.out.println("Nhập vị trí cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        NhanVien[] newNVs = new NhanVien[nhanViens.length - 1];
        for (int i = 0; i < nhanViens.length - 1; i++) {
            if (i < index) {
                newNVs[i] = nhanViens[i];
            } else {
                newNVs[i] = nhanViens[i + 1];
            }
        }
        nhanViens = newNVs;
    }

    public void showKhach() {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public void timTheoID() {

    }
}
