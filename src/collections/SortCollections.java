package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After  reverse sorting: " +list);
    }
}
