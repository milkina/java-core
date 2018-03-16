package lambda.stream;

import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
                .map(str -> {
                    System.out.println("Mapping: " + str);
                    return str.length();
                })
                .filter(i -> {
                    System.out.println("Filtering: " + i);
                    return i > 3;
                })
                .limit(2)
                .forEach(System.out::println);
    }
}
