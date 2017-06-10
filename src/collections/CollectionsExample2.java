package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        Collections.fill(list, "black");
        System.out.println(list);
    }
}
