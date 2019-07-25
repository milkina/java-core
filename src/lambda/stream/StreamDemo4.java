package lambda.stream;

import java.util.stream.IntStream;

public class StreamDemo4 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.of(28,4,91,30).sum()
        );
        System.out.println(
                IntStream.of(28,4,91,30).average()
        );
    }
}
