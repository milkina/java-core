package arrays;

import java.util.Arrays;

public class ArrayInverterTest2 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }
}
