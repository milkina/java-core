package formatter;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale locale : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println(locale + "---> " + df.format(date));
        }
    }
}
