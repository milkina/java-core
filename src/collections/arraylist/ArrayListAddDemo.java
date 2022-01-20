package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("Начальный размер list: " + list.size());

        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("F");
        list.add(1, "A2");
        list.set(0, "C2");

        System.out.println("Размер list после добавления: " + list.size());
        System.out.println("Содержимое list: " + list);
        System.out.println(list.get(0));
    }
}
