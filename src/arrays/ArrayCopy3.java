package arrays;

public class ArrayCopy3 {
    public static void main(String[] args) {
        byte[] array = new byte[1_000_000];
        testArrayCopy(array);
        testFor(array);
    }

    private static void testArrayCopy(byte[] array) {
        long start = System.nanoTime();
        System.arraycopy(array, 0, array, 1, array.length - 1);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d%n", stop - start);
    }

    private static void testFor(byte[] array) {
        long start = System.nanoTime();
        for (int k = 0; k < array.length - 2; k++) {
            array[k + 1] = array[k];
        }
        long stop = System.nanoTime();
        System.out.printf("for:       %,10d%n", stop - start);
    }
}
