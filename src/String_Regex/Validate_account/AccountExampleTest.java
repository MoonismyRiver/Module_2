package String_Regex.Validate_account;

public class AccountExampleTest {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();

        for (String account : validAccount) {
            accountExample.check(account);
        }
        for (String account : invalidAccount) {
            accountExample.check(account);
        }
    }
}

