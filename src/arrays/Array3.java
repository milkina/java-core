package arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] testScores = {1, 2, 3, 4};
        for (int element : testScores) {
            System.out.print(element + " ");
        }
        System.out.println();
        testScores = new int[]{4, 7, 2};
        for (int element : testScores) {
            System.out.print(element + " ");
        }
        System.out.println();

        print(new int[]{4, 6, 2, 3});
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
