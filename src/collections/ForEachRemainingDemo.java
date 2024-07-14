package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        Iterator<String> iterator = arrayList.iterator();
        iterator.forEachRemaining(str -> System.out.print(str + "+"));
    }
}
