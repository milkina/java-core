package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMinMaxDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 2, 5, 8, 9);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
