package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Начальный размер arrayList: "
                + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Размер arrayList после добавления: "
                + arrayList.size());
        System.out.println("Содержимое arrayList: " + arrayList);
        System.out.println(arrayList.get(0));
    }
}
