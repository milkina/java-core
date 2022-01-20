package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("F");
        list.add(1, "A2");
        list.set(0, "C2");

    /*    List<String> removeElements = List.of("C2", "A2", "AA", "F");
        System.out.println("Содержимое list до removeAll: "
                + list);

        list.removeAll(removeElements);
        System.out.println("Содержимое list после removeAll: "
                + list);*/
    }
}
