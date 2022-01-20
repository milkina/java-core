package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDemo {
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

        System.out.println("Содержимое list: " + list);
        System.out.println("Размер list после добавления: "
                + list.size());

        list.remove("F");
        list.remove(2);

        System.out.println("Размер list после удаления: "
                + list.size());
        System.out.println("Содержимое of list: " + list);
    }
}
