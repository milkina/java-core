package lambda.function;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.7));
    }
}
