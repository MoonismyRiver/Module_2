package TestTDD.FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTranslateTest {
    @Test
    @DisplayName("chu so chia het cho 3")
    public void TestFizzBuzz1() {
        FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();
        int a = 9;
        String expect = "Fizz";

        Assertions.assertEquals(expect, fizzBuzz.creatFizzBuzz(a));
    }

    @Test
    @DisplayName("chu so chia het cho 5")
    public void TestFizzBuzz2() {
        FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();
        int a = 20;
        String expect = "Buzz";

        Assertions.assertEquals(expect, fizzBuzz.creatFizzBuzz(a));
    }

    @Test
    @DisplayName("chu so chia het cho 3 va 5")
    public void TestFizzBuzz3() {
        FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();
        int a = 15;
        String expect = "FizzBuzz";

        Assertions.assertEquals(expect, fizzBuzz.creatFizzBuzz(a));
    }

    @Test
    @DisplayName("chu khong so chia het cho 3 va 5")
    public void TestFizzBuzz4() {
        FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();
        int a = 13;
        String expect = a + "";

        Assertions.assertEquals(expect, fizzBuzz.creatFizzBuzz(a));
    }
}
