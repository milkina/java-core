package lambda.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Stream", "Operations", "on", "Collections");
        Optional<String> optional = strings.stream()
               // .filter(s->s.length()<2)
                .min(Comparator.comparing(String::length));
        optional.ifPresent(System.out::println);
    }
}
