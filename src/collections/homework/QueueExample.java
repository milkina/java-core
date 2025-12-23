package collections.homework;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class QueueExample {
    public static void main(String[] args) {
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox(2, 2, 2, 2));
        heavyBoxes.offer(new HeavyBox(3, 3, 3, 3));
        heavyBoxes.offer(new HeavyBox(3, 3, 3, 4));
        heavyBoxes.offer(new HeavyBox(1, 1, 1, 5));

        while (!heavyBoxes.isEmpty()) {
            System.out.println(heavyBoxes.poll());
        }
    }
}
