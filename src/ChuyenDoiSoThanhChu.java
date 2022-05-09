import java.util.Scanner;

public class ChuyenDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("nhập số cần đọc (0-999): ");
            int input = sc.nextInt();
            int hangtram = input / 100;
            int donvi = input % 10;
            int hangchuc = ((input - donvi) / 10)%10;
            String dochangtram=sc.nextLine();
            String dochangchuc=sc.nextLine();
            String docdonvi=sc.nextLine();
            switch (hangtram){
                case 1 :
                    dochangtram="một";
                    break;
                case 2:
                    dochangtram = "hai";
                    break;
                case 3 :
                    dochangtram="ba";
                    break;
                case 4 :
                    dochangtram="bốn";
                    break;
                case 5 :
                    dochangtram="năm";
                    break;
                case 6 :
                    dochangtram="sáu";
                    break;
                case 7 :
                    dochangtram="bảy";
                    break;
                case 8 :
                    dochangtram="tám";
                    break;
                case 9 :
                    dochangtram="chín";
                    break;

            }
            switch (hangchuc){
                case 1 :
                    dochangchuc="một";
                    break;
                case 2:
                    dochangchuc = "hai";
                    break;
                case 3 :
                    dochangchuc="ba";
                    break;
                case 4 :
                    dochangchuc="bốn";
                    break;
                case 5 :
                    dochangchuc="năm";
                    break;
                case 6 :
                    dochangchuc="sáu";
                    break;
                case 7 :
                    dochangchuc="bảy";
                    break;
                case 8 :
                    dochangchuc="tám";
                    break;
                case 9 :
                    dochangchuc="chín";
                    break;

            }
            switch (donvi){
                case 1 :
                    docdonvi="một";
                    break;
                case 2:
                    docdonvi = "hai";
                    break;
                case 3 :
                    docdonvi="ba";
                    break;
                case 4 :
                    docdonvi="bốn";
                    break;
                case 5 :
                    docdonvi="năm";
                    break;
                case 6 :
                    docdonvi="sáu";
                    break;
                case 7 :
                    docdonvi="bảy";
                    break;
                case 8 :
                    docdonvi="tám";
                    break;
                case 9 :
                    docdonvi="chín";
                    break;

            }


            System.out.print(dochangtram +" "+ dochangchuc+" "+ docdonvi);
        }
    }
