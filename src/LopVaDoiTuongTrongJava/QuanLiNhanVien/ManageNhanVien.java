//package LopVaDoiTuongTrongJava.QuanLiNhanVien;
//
//import java.util.Scanner;
//
//public class ManageNhanVien {
//    NhanVien nhanViens = new NhanVien();
//    Scanner input = new Scanner(System.in);
//
//    public void menu() {
//        int choice = -1;
//        while (choice != 5) {
//
//            System.out.println("QUẢN LÍ NHÂN VIÊN");
//            System.out.println("Menu");
//            System.out.println("1.Thêm");
//            System.out.println("2.Sửa");
//            System.out.println("3.Xóa");
//            System.out.println("4.Hiển thị");
//            System.out.println("5.Thoát");
//            System.out.println("nhập lựa chọn của bạn :");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//
//
//                    System.out.print("Nhập id nhân viên :");
//                    int id = Integer.parseInt(input.nextLine());
//                    System.out.print("Nhập tên nhân viên :");
//                    String name = input.nextLine();
//                    System.out.print("Nhập tuổi nhân viên :");
//                    int age = Integer.parseInt(input.nextLine());
//                    System.out.print("Nhập địa chỉ nhân viên :");
//                    String address = input.nextLine();
//
//                    break;
//                case 2:
//                    System.out.println("Nhập id nhân viên muốn sửa : ");
//                    int edit = input.nextInt();
//                    System.out.println("Nhập lại thông tin :");
//                    System.out.print("Nhập tuổi nhân viên :");
//                    int age2 = input.nextInt();
//                    System.out.print("Nhập id nhân viên :");
//                    String id2 = input.nextLine();
//                    System.out.print("Nhập tên nhân viên :");
//                    String name2 = input.nextLine();
//                    System.out.print("Nhập địa chỉ nhân viên :");
//                    String address2 = input.nextLine();
//                    nhanViens.edit();
//                    break;
//                case 3:
//                    System.out.println("Nhập số thứ tự nhân viên muốn xóa");
//                    int del = input.nextInt();
//                    nhanViens.deltele();
//                    break;
//                case 4:
//                    System.out.println("Danh sách nhân viên :");
//                    show();
//                    break;
//                case 5:
//                    System.exit(0);
//                default:
//                    System.out.println("Mời chọn lại.");
//
//            }
//
//        }
//
//    }
//
//    public NhanVien creat() {
//        System.out.println("nhập id: ");
//        int id = input.nextInt();
//        System.out.println("nhập age :");
//        int age = input.nextInt();
//        System.out.println("nhập name");
//        String name = input.nextLine();
//        System.out.println("nhập address : ");
//        String address = input.nextLine();
//
//        return new NhanVien();
//    }
//
//    public void editByIndex() {
//        System.out.println("Nhập vị trí cần sửa");
//        int index = Integer.parseInt(input.nextLine());
//    }
//
//    public void add(NhanVien nhanVien) {
//        NhanVien[] newNVs = new NhanVien[nhanViens.length + 1];
//        for (int i = 0; i < nhanViens.length; i++) {
//            newNVs[i] = nhanViens[i];
//        }
//    }
//
//    public void show() {
//        for (NhanVien nv : nhanViens) {
//            System.out.println(nv.toString());
//        }
//}}
