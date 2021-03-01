package quality.matrixes;

import java.util.Arrays;

public class MatrixWrong {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 1, 1}};
        int[][] matrix2 = {{2, 2, 2}, {2, 2, 2}};
        int coefficient = 10;

        int[][] result = new int[matrix2.length][matrix2[0].length];
        for (int i = 0; i < matrix2.length; ++i) {
            for (int j = 0; j < matrix2[0].length; ++j) {
                result[i][j] = matrix2[i][j] * coefficient;
            }
        }
        System.out.println(Arrays.deepToString(result));

        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));

        int[][] difference = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(difference));
    }
}
