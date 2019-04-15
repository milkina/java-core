package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый", "черный");
        System.out.println("Перед reversing: " + list);
        Collections.reverse(list);
        System.out.println("После reversing: " + list);
        Collections.shuffle(list);
        System.out.println("После shuffling: " + list);
    }
}
