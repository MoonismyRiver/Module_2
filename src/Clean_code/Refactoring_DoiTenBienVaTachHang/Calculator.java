package Clean_code.Refactoring_DoiTenBienVaTachHang;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int b, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + b;
            case SUBTRACTION:
                return firstOperand - b;
            case MULTIPLICATION:
                return firstOperand * b;
            case DIVISION:
                if (b != 0)
                    return firstOperand / b;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}