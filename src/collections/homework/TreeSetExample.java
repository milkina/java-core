package collections.homework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxes = new TreeSet<>();
        heavyBoxes.add(new HeavyBox(2, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(3, 3, 3, 3));
        heavyBoxes.add(new HeavyBox(3, 3, 3, 4));
        heavyBoxes.add(new HeavyBox(1, 1, 1, 5));

        System.out.println(heavyBoxes);
    }

}
