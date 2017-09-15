package arrays;

/**
 * Created by Tatyana on 13.09.2017.
 */
public class ArraySize {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[][] array2 = {{1, 1, 1}, {2, 2, 2}};
        System.out.println("Размер массива array1 = " + array1.length);
        System.out.println("Размер массива array2 = " + array2.length);
        System.out.println("Размер 1-строки массива array2 = " + array2[0].length);
    }
}
