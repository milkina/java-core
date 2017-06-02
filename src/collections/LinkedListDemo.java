package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        // Create a linked list.
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the linked list.
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");

        list.add(1, "A2");

        System.out.println("Original contents of list: " + list);

        // Remove elements from the linked list.
        list.remove("F");
        list.remove(2);

        System.out.println("Contents of list after deletion: "
                + list);

        // Remove first and last elements.
        list.removeFirst();
        list.removeLast();

        System.out.println("list after deleting first and last: "
                + list);

        // Get and set a value.
        String val = list.get(2);
        list.set(2, val + " Changed");

        System.out.println("list after change: " + list);
    }
}
