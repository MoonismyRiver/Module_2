package String_Regex.Validate_soDienThoai;


public class ValidateTelephoneNumberTest {
    public static final String[] validTelephoneNumber = new String[]{"84-0978489648", "(84)-(01234456789)", "(83)-(0979849563)"};
    public static final String[] invalidTelephoneNumber = new String[]{"(a8)-(22222222)", "(HU)-(222ge297)", "(7d)-(-32225673)"};

    public static void main(String[] args) {
        ValidateTelephoneNumber validateTelephoneNumber = new ValidateTelephoneNumber();

        for (String name : validTelephoneNumber) {
            validateTelephoneNumber.check(name);
        }
        for (String name : invalidTelephoneNumber) {
            validateTelephoneNumber.check(name);
        }
    }
}
