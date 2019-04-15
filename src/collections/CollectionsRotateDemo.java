package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotateDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(list);

        Collections.rotate(list, 2);
        System.out.println(list);

        Collections.rotate(list, -1);
        System.out.println(list);
    }
}
