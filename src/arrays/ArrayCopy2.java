package arrays;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));

        System.arraycopy(array, 1, array, 3, 3);
        System.out.println(Arrays.toString(array));
    }
}
