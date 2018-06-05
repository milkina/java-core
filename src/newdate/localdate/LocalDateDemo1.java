package newdate.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        // С годом(-999999999 to 999999999),
        // месяцем (1 to 12), день месяца (1 - 31)
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
        System.out.println(newYear2001);

        // Можно использовать перечисление java.time.Month
        LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(newYear2002);

        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
