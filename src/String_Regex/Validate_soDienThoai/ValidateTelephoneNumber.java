package String_Regex.Validate_soDienThoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTelephoneNumber {


    public ValidateTelephoneNumber() {
    }

    private static final String TELEPHONE_NUMBER_REGEX = "[\\d]{2}-0[\\d]{9}";
//    (xx)-(0xxxxxxxxx)


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(TELEPHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public void check(String phone) {
        System.out.println("Telephone Number " + phone);
        if (validate(phone)) {
            System.out.println("Số điện thoại ok ! ");
        } else {
            System.out.println("Số điện thoại sai ! ");
        }
    }
}
