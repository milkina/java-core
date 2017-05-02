package arrays;

public class InsertionSorter {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int tmp = array[j - 1]; // меняем местами элементы j и j-1
                array[j - 1] = array[j];
                array[j] = tmp;
            }
        }
    }
}
