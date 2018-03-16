package lambda.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", null, "hello");
        words.stream()
                .filter(t -> t != null)
                .distinct()
                .forEach(System.out::println);
    }
}
