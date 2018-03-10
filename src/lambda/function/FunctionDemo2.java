package lambda.function;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s + "1";
        Function<String, String> f2 = s -> s + "2";
        Function<String, String> f3 = s -> s + "3";
        System.out.println(f1.andThen(f2).compose(f3).apply("Compose"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("AndThen"));
    }
}
