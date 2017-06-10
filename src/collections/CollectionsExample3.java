package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        Collections.sort(list);

        System.out.println(list);
        System.out.println("(1) Index: "
                + Collections.binarySearch(list, "red"));
        System.out.println("(2) Index: "
                + Collections.binarySearch(list, "cyan"));
    }
}
