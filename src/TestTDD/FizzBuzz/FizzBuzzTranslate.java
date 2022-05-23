package TestTDD.FizzBuzz;

public class FizzBuzzTranslate {
    public String creatFizzBuzz(int a) {
        boolean fizz = a % 3 == 0;
        boolean buzz = a % 5 == 0;
        boolean fizzbuzz = a % 5 == 0 && a % 3 == 0;
        if (fizzbuzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return a + "";
        }
    }
}