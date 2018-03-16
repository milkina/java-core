package lambda.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", null, "");
        words.stream()
                .filter(t -> t != null)
                .filter(t -> !t.isEmpty())
                .forEach(System.out::println);
    }
}
