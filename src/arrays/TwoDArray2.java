package arrays;

public class TwoDArray2 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
