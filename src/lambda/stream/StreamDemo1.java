package lambda.stream;

import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
                .map(String::length)
                .filter(i -> i > 3)
                .limit(2)
                .forEach(System.out::println);
    }
}
