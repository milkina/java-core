package algoritms;

import java.time.Duration;
import java.time.LocalTime;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 25;
        LocalTime localTime1 = LocalTime.now();
        System.out.print("Рекурсия " + recursive(n));
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(", время выполнения - " + duration1);

        LocalTime localTime3 = LocalTime.now();
        System.out.print("Цикл for " + calculateWithFor(n));
        LocalTime localTime4 = LocalTime.now();
        Duration duration2 = Duration.between(localTime3, localTime4);
        System.out.println(", время выполнения - " + duration2);
    }

    /**
     * Сложность О(n)
     *
     * @param n
     * @return
     */
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /**
     * Сложность О(2^n)
     *
     * @param n
     * @return
     */
    private static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }
}