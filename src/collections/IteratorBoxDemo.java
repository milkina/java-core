package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBoxDemo {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(10, 10, 10));
        boxes.add(new Box(20, 20, 20));
        boxes.add(new Box(30, 30, 30));
        boxes.add(new Box(10, 40, 30));
        boxes.add(new Box(60, 60, 60));

        List<Box> largeBoxes = new ArrayList<>();

        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30) {
                largeBoxes.add(box);
                iterator.remove();
            }
        }
        System.out.println("Маленькие ящики: " + boxes);
        System.out.println("Большие ящики: " + largeBoxes);
    }
}
