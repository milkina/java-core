package newdate.localtime;

import java.time.LocalTime;

public class LocalTimeDemo1 {
    public static void main(String[] args) {
        // С часами (0-23) и минутами(0-59)
        LocalTime fiveThirty = LocalTime.of(5, 30);
        // С часами, минутами и секундами(0-59)
        LocalTime noon = LocalTime.of(12, 0, 0);
        // С часами, минутами, секундами и наносекундами
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 999999);

        System.out.println(fiveThirty);
        System.out.println(noon);
        System.out.println(almostMidnight);
    }
}
