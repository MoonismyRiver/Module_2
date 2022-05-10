package VongLap;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi : ");
        double money = input.nextDouble();
        System.out.println("Nhập số tháng gửi : ");
        int month = input.nextInt();
        System.out.println("Nhập lãi suất tháng (%) : ");
        double interestRate = input.nextDouble();
        double totalInterest = 0;
        for ( int i =0 ; i< month ; i++){
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println(" Tổng số tiền lãi là : " + totalInterest);
    }
}
