package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        System.out.println("Before reversing: " + list);
        Collections.reverse(list);
        System.out.println("After reversing: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);
    }
}
