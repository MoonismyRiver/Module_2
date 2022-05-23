package TestTDD.TinhNgayTiepTheo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;


public class NextDayCalculatorTest {
    @Test
    @DisplayName("check nextDay")
    public void TestNextDay() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2018-1-1";
        String ExDate = "2018-01-02";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }

    @Test
    @DisplayName("check nextDay")
    public void TestNextDay1() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2018-01-31";
        String ExDate = "2018-02-01";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }

    @Test
    @DisplayName("check nextDay")
    public void TestNextDay2() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2018-4-30";
        String ExDate = "2018-05-01";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }

    @Test
    @DisplayName("check nextDay")
    public void TestNextDay3() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2018-2-28";
        String ExDate = "2018-03-01";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }

    @Test
    @DisplayName("check nextDay")
    public void TestNextDay4() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2020-2-29";
        String ExDate = "2020-03-01";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }

    @Test
    @DisplayName("check nextDay")
    public void TestNextDay5() throws ParseException {
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String date = "2018-12-31";
        String ExDate = "2019-01-01";

        String result = nextDayCalculator.nextDay(date);

        Assertions.assertEquals(ExDate,result);
    }
}
