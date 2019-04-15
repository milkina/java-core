package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый");
        Collections.sort(list);

        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "красный"));
        System.out.println(Collections.binarySearch(list, "черный"));
    }
}
