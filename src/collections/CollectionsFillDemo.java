package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFillDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый");
        Collections.fill(list, "черный");
        System.out.println(list);
    }
}
