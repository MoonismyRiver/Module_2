package TestTDD.TinhNgayTiepTheo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class NextDayCalculator {
    public String nextDay(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, 1);
        date = sdf.format(c.getTime());
        return date;
    }
}
