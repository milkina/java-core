package lambda.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6);
        arrayList.forEach(System.out::println);
    }
}
