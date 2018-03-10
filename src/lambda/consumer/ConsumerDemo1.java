package lambda.consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("Hello world");
    }
}
