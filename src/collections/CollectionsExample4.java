package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
