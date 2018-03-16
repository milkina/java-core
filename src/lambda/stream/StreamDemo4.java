package lambda.stream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach(System.out::println);
    }
}
