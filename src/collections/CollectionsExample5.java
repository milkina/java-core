package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample5 {
    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(4, 5, 6, 7);
        Collections.copy(dest, src);
        System.out.println(dest);
    }
}
