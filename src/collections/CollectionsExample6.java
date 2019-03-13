package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("publicVar");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println("Original List : " + list);

        Collections.rotate(list, 2);
        System.out.println("Rotated List: " + list);

        Collections.rotate(list, -1);
        System.out.println("Rotated List: " + list);
    }
}
