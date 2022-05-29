package homework.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(2, 2, 2, 2));
        list.add(new HeavyBox(1, 1, 1, 1));
        list.add(new HeavyBox(3, 3, 3, 3));

        //Распечатать его содержимое используя for each
        list.forEach(System.out::println);

        //Изменить вес первого ящика на 1
        changeBoxWeight(list.get(0));

        //Удалить последний ящик
        list.remove(list.size() - 1);

        //Получить массив содержащий объекты класса HeavyBox из коллекции тремя способами
        // и вывести на консоль
        convertToArray(list);

        //Удалить все ящики
        list.clear();
    }

    private static void convertToArray(List<HeavyBox> list) {
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        HeavyBox[] boxes1 =new HeavyBox[list.size()];
        list.toArray(boxes1);
        System.out.println(Arrays.toString(boxes1));

        HeavyBox[] boxes2 = list.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(boxes2));
    }

    //Изменить вес ящика на 1
    private static void changeBoxWeight(HeavyBox box) {
        box.setWeight(box.getWeight() + 1);
    }
}
