package lambda.optional;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        Optional<String> emptySummary = Optional.empty();
        Optional<String> summary1 = Optional.of("A summary");
        Optional<String> summary2 = Optional.ofNullable(null);

        emptySummary.ifPresent(System.out::println);
        summary1.ifPresent(System.out::println);
        summary2.ifPresent(System.out::println);

        System.out.println(summary1.get());

        String summaryOrDefault = summary2.orElse("Default summary");
        System.out.println(summaryOrDefault);
        System.out.println(summary2.orElseGet(() -> "Default summary"));
    }
}
