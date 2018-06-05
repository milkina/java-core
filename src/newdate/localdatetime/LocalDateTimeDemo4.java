package newdate.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newYear2001 = LocalDateTime.of(2001, 1, 1, 11, 23);
        // Adding
        LocalDateTime dt10 = now.plusYears(4);
        LocalDateTime dt11 = now.plusWeeks(3);
        LocalDateTime dt12 = newYear2001.plus(2, ChronoUnit.HOURS);

        // Subtracting
        LocalDateTime dt13 = now.minusMonths(2);
        LocalDateTime dt14 = now.minusNanos(1);
        LocalDateTime dt15 = now.minus(10, ChronoUnit.SECONDS);
    }
}
