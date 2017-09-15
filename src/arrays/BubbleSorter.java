package arrays;

public class BubbleSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length ; i++) {            // i - номер прохода
            for (int j = array.length - 1; j > i; j--) {     // внутренний цикл прохода
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
