package arrays;

import java.util.Arrays;

public class ArrayCopy4 {
    public static void main(String[] args) {
        int size = 5;
        int[] array = {20, 30, 40, 50, 60, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        int[] insert = {15, 95, 30};

        for (int newElem : insert) {
            int newPosition = Arrays.binarySearch(array, 0, size, newElem);
            if (newPosition < 0) {
                newPosition = -newPosition - 1;
            }
            System.arraycopy(array, newPosition, array, newPosition + 1, size - newPosition);
            array[newPosition] = newElem;
            System.out.println(Arrays.toString(array));
            size++;
        }
    }
}
