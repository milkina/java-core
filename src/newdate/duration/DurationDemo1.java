package newdate.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationDemo1 {
    public static void main(String[] args) {
        Duration oneDay = Duration.ofDays(1); // 1 day = 86400 seconds
        Duration oneHour = Duration.ofHours(1); // 1 hour = 3600 seconds
        Duration oneMin = Duration.ofMinutes(1); // 1 minute = 60 seconds
        Duration tenSeconds = Duration.ofSeconds(10);
        // Set seconds and nanoseconds (if they are outside the range
        // 0 to 999,999,999, the seconds will be altered, like below)
        Duration twoSeconds = Duration.ofSeconds(1, 1_000_000_000);
        // Seconds and nanoseconds are extracted from the passed millisecs
        Duration oneSecondFromMillis = Duration.ofMillis(2);
        // Seconds and nanoseconds are extracted from the passed nanos
        Duration oneSecondFromNanos = Duration.ofNanos(1000000000);
        Duration oneSecond = Duration.of(1, ChronoUnit.SECONDS);

        System.out.println(oneDay);
        System.out.println(oneHour);
        System.out.println(oneMin);
        System.out.println(tenSeconds);
        System.out.println(twoSeconds);
        System.out.println(oneSecondFromMillis);
        System.out.println(oneSecondFromNanos);
        System.out.println(oneSecond);
    }
}
