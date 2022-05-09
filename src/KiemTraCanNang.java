import java.util.Scanner;
public class KiemTraCanNang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cannang,chieucao,bmi;

        System.out.print("nhập cân nặng (kg) : ");
        cannang = scanner.nextDouble();
        System.out.print("nhập chiều cao (m) : ");
        chieucao = scanner.nextDouble();
        bmi = cannang / Math.pow(chieucao, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
