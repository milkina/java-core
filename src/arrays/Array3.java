package arrays;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] testScores = {1, 2, 3, 4};
        System.out.println(Arrays.toString(testScores));
        testScores = new int[]{4, 7, 2};
        System.out.println(Arrays.toString(testScores));

        print(new int[]{4, 6, 2, 3});
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
