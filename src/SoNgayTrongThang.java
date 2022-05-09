import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days ?  ");
        int month = scanner.nextInt();
        String ngaytrongThang;
        switch (month) {
            case 2:
                ngaytrongThang = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngaytrongThang = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngaytrongThang = "30";
                break;
            default:
                ngaytrongThang = "";

        }
        if (!ngaytrongThang.equals("")) System.out.printf("Tháng %d có %s ngày",month,ngaytrongThang );
            else System.out.print("Dữ liệu không chính xác !");
    }
}
