package String_Regex.Validate_ten_cua_lop_hoc;



public class ValidateClassTest {
    public static final String[] validClassName = new String[]{"C0318G", "A0388K", "P1234H"};
    public static final String[] invalidClassName = new String[]{"M0318G", "12345", "P0323A", "abcde"};

    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();

        for (String name : validClassName) {
            validateClass.check(name);
        }
        for (String name : invalidClassName) {
            validateClass.check(name);
        }
    }
}
