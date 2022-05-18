package Clean_code.Refactoring_TachBien;


class FizzBuzzTest {
    public static void main(String[] args) {

        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);

        System.out.println(expected+"--"+result);
    }
}

