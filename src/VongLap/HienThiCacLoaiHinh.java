package VongLap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Vẽ chữ nhật ");
            System.out.println("2. Vẽ tam giác vuông");
            System.out.println("3. Vẽ tam giác cân ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Vẽ tam giác vuông");
                    System.out.println("*          ");
                    System.out.println("* *        ");
                    System.out.println("* * *      ");
                    System.out.println("* * * *    ");
                    System.out.println("* * * * *  ");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ tam giác cân");
                    System.out.println("     *    ");
                    System.out.println("   * * *   ");
                    System.out.println("* * * * * *");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}


