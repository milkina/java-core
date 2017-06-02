package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();

        arrayList1.add("A");
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");
        arrayList1.add("F");

        arrayList2.add("F");
        arrayList2.add("FF");
        arrayList2.add("E");

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
    }
}
