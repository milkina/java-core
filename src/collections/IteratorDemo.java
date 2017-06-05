package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String args[]) {
        // Create an array list.
        List<String> arrayList = new ArrayList<>();

        // Add elements to the array list.
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        // Use iterator to display contents of arrayList.
        System.out.print("Original contents of arrayList: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
