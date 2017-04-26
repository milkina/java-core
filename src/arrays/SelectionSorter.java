package arrays;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {    // цикл выбора наименьшего элемента
                if (array[j] < x) {
                    k = j;    // k - индекс наименьшего элемента
                    x = array[j];
                }
            }
            array[k] = array[i];
            array[i] = x;    // меняем местами наименьший с a[i]
        }
    }
}
