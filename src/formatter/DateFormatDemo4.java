package formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by Tatyana on 27.10.2017.
 */
public class DateFormatDemo4 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        try {
            Date date2 = df.parse("09.09.01");
            System.out.println("parsed = " + date2);
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
