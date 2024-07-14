package collections.map;

import collections.Box;
import interfaces.B;

import java.util.HashMap;
import java.util.Map;

public class PutAllExample {
    public static void main(String[] args) {
        Map<Number, Box> smallBoxes = new HashMap<>();
        smallBoxes.put(1, new Box(1, 1, 1));
        smallBoxes.put(2, new Box(3, 4, 5));
        smallBoxes.put(3, new Box(6, 8, 9));

        Map<Number, Box> bigBoxes = new HashMap<>();
        bigBoxes.put(4, new Box(100, 200, 300));
        bigBoxes.put(5, new Box(500, 500, 500));

        bigBoxes.putAll(smallBoxes);

        System.out.println(bigBoxes);
    }
}
