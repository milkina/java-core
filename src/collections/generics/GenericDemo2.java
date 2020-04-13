package collections.generics;

import oop.Box6;
import oop.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo2 {
    public static void main(String[] args) {
        List<Box6> boxes = new ArrayList<>();
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        addBox(boxes);
        addBox(heavyBoxes);

        System.out.println(boxes);
        System.out.println(heavyBoxes);
    }

    public static void addBox(List<? super HeavyBox> list) {
        list.add(new HeavyBox());
    }

   /* public static <T> T getBox(List<? super T> list) {
        return list.get(0);
    }*/
}
