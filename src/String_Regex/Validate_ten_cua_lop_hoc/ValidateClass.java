package String_Regex.Validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public ValidateClass() {
    }

    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public void check(String name) {
        System.out.println("Class name " + name);
        if (validate(name)) {
            System.out.println("Tên lớp ok ! ");
        } else {
            System.out.println("Tên lớp sai ! ");
        }
    }

}
