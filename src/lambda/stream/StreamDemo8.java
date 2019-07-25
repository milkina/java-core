package lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamDemo8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", null, "world","hi");
        words.stream()
                .filter(Objects::nonNull)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
