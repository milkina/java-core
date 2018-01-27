package formatter;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L);

        System.out.printf("%-48s %-24s%n", "DateFormat.getInstance():",
                DateFormat.getInstance().format(date));
        System.out.printf("%-48s %-24s%n", "DateFormat.getDateInstance():",
                DateFormat.getDateInstance().format(date));
        System.out.printf("%-48s %-24s%n", "DateFormat.getDateInstance(DateFormat.SHORT)",
                DateFormat.getDateInstance(DateFormat.SHORT).format(date));
        System.out.printf("%-48s %-24s%n", "DateFormat.getDateInstance(DateFormat.MEDIUM)",
                DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));
        System.out.printf("%-48s %-24s%n", "DateFormat.getDateInstance(DateFormat.LONG)",
                DateFormat.getDateInstance(DateFormat.LONG).format(date));
        System.out.printf("%-48s %-24s%n", "DateFormat.getDateInstance(DateFormat.FULL)",
                DateFormat.getDateInstance(DateFormat.FULL).format(date));
    }
}
