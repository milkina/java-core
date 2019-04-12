package collections.queue;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");
        list.addLast("Z");
        list.addFirst("A");
        list.add(1, "A2");
        System.out.println("Содержимое: " + list);

        list.remove("F");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("Содержимое после удаления: " + list);

        String val = list.get(2);
        list.set(2, val + "+");
        System.out.println("Содержимое после изменения: " + list);
    }
}
