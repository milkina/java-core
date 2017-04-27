package arrays;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(arr, 20);
        int pos2 = Arrays.binarySearch(arr, 25);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
