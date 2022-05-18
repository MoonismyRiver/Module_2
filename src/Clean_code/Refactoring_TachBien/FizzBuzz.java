package Clean_code.Refactoring_TachBien;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean chiahetcho3 = number % 3 == 0;
        boolean chiahetcho5 = number % 5 == 0;
        if (chiahetcho3 && chiahetcho5)
            return "FizzBuzz";

        if (chiahetcho3)
            return "Fizz";

        if (chiahetcho5)
            return "Buzz";

        return number + "";
    }
}