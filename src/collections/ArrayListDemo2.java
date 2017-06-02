package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(null);
        //1 вариант
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //2 вариант
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //3 вариант
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
