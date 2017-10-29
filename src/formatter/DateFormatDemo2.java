package formatter;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L);
        System.out.println("Заданная дата = " + date);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(date);

        System.out.println("Заданная дата в стиле SHORT = " + s);
    }
}
