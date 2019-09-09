package algoritms;

public class Search {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 12, 25, 67};
        System.out.println(linearSearch(new int[]{1, 8, 9, 3, 7, 5}, 7));
        System.out.println(binarySearch(array, 9));
        System.out.println(recursiveBinarySearch(array, 0, array.length - 1, 9));
        System.out.println(jumpSearch(array, 10));
    }

    /**
     * Линейный поиск, сложность O(n)
     *
     * @param array
     * @param elementToSearch
     * @return индекс найденного элемента или -1, если такого не оказалось.
     */
    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Двоичный поиск, итеративный подход, сложность O(log (N))
     *
     * @param array
     * @param elementToSearch
     * @return индекс найденного элемента или -1, если такого не оказалось.
     */
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    /**
     * Двоичный поиск, рекурсивный подход, сложность O(log (N))
     *
     * @param array
     * @param firstElement
     * @param lastElement
     * @param elementToSearch
     * @return индекс найденного элемента или -1, если такого не оказалось.
     */
    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        // условие прекращения
        if (lastElement >= firstElement) {
            int middle = (lastElement + firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middle] == elementToSearch) {
                return middle;
            }

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (array[middle] > elementToSearch) {
                return recursiveBinarySearch(array, firstElement, middle - 1, elementToSearch);
            }

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(array, middle + 1, lastElement, elementToSearch);
        }
        return -1;
    }

    /**
     * Поиск прыжками, O(sqrt (N))
     *
     * @param array
     * @param elementToSearch
     * @return индекс найденного элемента или -1, если такого не оказалось.
     */
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }
}
