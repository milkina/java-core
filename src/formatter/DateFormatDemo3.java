package formatter;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + df.format(date));
        }
    }
}
