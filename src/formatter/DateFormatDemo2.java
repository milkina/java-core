package formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) {
        Date date1 = new Date(1000000000000L);
        System.out.println("date1 = " + date1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(date1);

        System.out.println(s);
        try {
            Date date2 = df.parse(s);
            System.out.println("parsed = " + date2);
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
