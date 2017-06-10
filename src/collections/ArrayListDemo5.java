package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.remove(4);
        System.out.println(arrayList);
    }
}
