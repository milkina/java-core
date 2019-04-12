package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsGenericDemo {
    public static void main(String[] args) {
        //  List<Object> list1 = new ArrayList<String>();НЕТ!

        List<String> stringList = List.of("A", "B", "C");
        List<Integer> intList = List.of(1, 2, 3);

        List<?> unknownTypeList1 = stringList;
        unknownTypeList1 = intList;
        print(unknownTypeList1);

        List<? extends Number> listExtendsNum = new ArrayList<>();
        //listExtendsNum.add(new Integer(1));
        listExtendsNum = new ArrayList<Integer>();
        listExtendsNum = new ArrayList<Double>();

        List<? super Integer> list = new ArrayList<Number>();
        list.add(1);
        list.add(2);
     }

    private static void print(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        // list.add("A"); //НЕТ!
        System.out.println("Размер: " + list.size());
    }
}
