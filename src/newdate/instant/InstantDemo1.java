package newdate.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantDemo1 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        Instant i1 = now.with(ChronoField.NANO_OF_SECOND, 10);
        // Устанавливаем секунды
        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
        // Устанавливаем секунды и наносекунды (могут быть отрицательные)
        Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
        // Устанавливаем милисекунды после (могут быть и до) эпохи
        Instant fifthyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);

        System.out.println(i1);
        System.out.println(now);
        System.out.println(fiveSecondsAfterEpoch);
        System.out.println(sixSecTwoNanBeforeEpoch);
        System.out.println(fifthyMilliSecondsAfterEpoch);
    }
}
