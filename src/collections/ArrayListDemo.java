package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Initial size of arrayList: " +
                arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Size of arrayList after additions: " +
                arrayList.size());

        System.out.println("Contents of arrayList: " + arrayList);

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Size of arrayList after deletions: " +
                arrayList.size());
        System.out.println("Contents of arrayList: " + arrayList);

        List<String> removeElements = new ArrayList<>();
        removeElements.add("C2");
        removeElements.add("A2");
        removeElements.add("AA");

        arrayList.removeAll(removeElements);
        System.out.println("Size of arrayList after removeAll: " +
                arrayList.size());
        System.out.println("Contents of arrayList after removeAll: " + arrayList);
    }
}
