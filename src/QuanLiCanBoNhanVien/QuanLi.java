package QuanLiCanBoNhanVien;

import java.util.Scanner;

public class QuanLi {
    CanBo[] canBo = new CanBo[0];
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("Menu");
        System.out.println("1.Nhập thông tin mới cho cán bộ ");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Hiển thị thông tin cán bộ tìm được");
        System.out.println("4. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                create();
//                break;
//            case 2:
//                editByIndex();
//                break;
//            case 3:
//                deleteNV();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void create() {
        System.out.println("Cán bộ là :");
        System.out.println("1.Nhân viên");
        System.out.println("2. Công nhân");
        System.out.println("3. Kỹ Sư");
        System.out.println("4. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
//                editByIndex();
//                break;
//            case 3:
//                deleteNV();
                break;
            case 4:
                System.exit(0);
        }
    }
    public void nhapthongtin(){

        System.out.println("nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name: ");
        String chucvu = scanner.nextLine();
        System.out.println("nhập address: ");
        String address = scanner.nextLine();
    }
}

