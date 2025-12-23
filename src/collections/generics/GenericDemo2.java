package collections.generics;

import oop.Box;
import oop.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo2 {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        addHeavyBox(boxes);
        addHeavyBox(heavyBoxes);

        System.out.println(boxes);
        System.out.println(boxes.get(0));
        System.out.println(heavyBoxes);
    }

    public static void addHeavyBox(List<? super HeavyBox> list) {
        list.add(new HeavyBox());
    }

   /* public static <T> T getBox(List<? super T> list) {
        list.get(0);
        return list.get(0);
    }*/
}
