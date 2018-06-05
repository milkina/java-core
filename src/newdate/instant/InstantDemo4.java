package newdate.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo4 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        // Добавление
        Instant dt10 = now.plusSeconds(400);
        Instant dt11 = now.plusMillis(98622200);
        Instant dt12 = now.plusNanos(300013890);
        Instant dt13 = now.plus(2, ChronoUnit.MINUTES);

        // Вычитание
        Instant dt14 = now.minusSeconds(2);
        Instant dt15 = now.minusMillis(1);
        Instant dt16 = now.minusNanos(1);
        Instant dt17 = now.minus(10, ChronoUnit.SECONDS);
    }
}
