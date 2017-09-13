package arrays;

import java.util.Arrays;

import static arrays.ArrayInverter.invert;

public class ArrayInverterTest1 {
    public static void main(String[] args) {
        int[] array1;

        array1 = new int[]{};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1, 2};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1);
        System.out.println(Arrays.toString(array1));
    }
}
