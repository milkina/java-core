package arrays;

import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] array0 = {1, 2, 3, 4, 5, 6};
        int[] array1 = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("array0: " + Arrays.toString(array0));
        System.out.println("array1: " + Arrays.toString(array1));

        System.arraycopy(array0, 1, array1, 2, 3);
        System.out.println("array1: " + Arrays.toString(array1));
    }
}
