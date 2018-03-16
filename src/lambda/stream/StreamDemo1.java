package lambda.stream;

import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 4, 5, 67, 8, -4);
        System.out.println(stream.count());
    }
}
