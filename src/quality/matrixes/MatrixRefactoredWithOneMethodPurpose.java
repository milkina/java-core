package quality.matrixes;

import java.util.Arrays;

public class MatrixRefactoredWithOneMethodPurpose {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 1, 1}};
        int[][] matrix2 = {{2, 2, 2}, {2, 2, 2}};
        int coefficient = 10;

        int[][] matrix2Multiplied = multiply(matrix2, coefficient);
        print(matrix2Multiplied);

        int[][] sum = getSum(matrix1, matrix2);
        print(sum);

        int[][] difference = getDifference(matrix1, matrix2);
        print(difference);

        int[][] exampleResult = calculateExample(matrix1, 5, matrix2, 6);
        print(exampleResult);
    }

    /**
     * Calculate matrix1 * coefficient1+ matrix2 * coefficient2;
     *
     * @return an int[][] array
     */
    private static int[][] calculateExample(int[][] matrix1, int coefficient1, int[][] matrix2, int coefficient2) {
        int[][] matrix1Multiplied = multiply(matrix1, coefficient1);
        int[][] matrix2Multiplied = multiply(matrix2, coefficient2);
        return getSum(matrix1Multiplied, matrix2Multiplied);
    }

    private static int[][] getDifference(int[][] matrix1, int[][] matrix2) {
        int[][] difference = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return difference;
    }

    private static void print(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }

    private static int[][] getSum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    private static int[][] multiply(int[][] matrix, int coefficient) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                result[i][j] = matrix[i][j] * coefficient;
            }
        }
        return result;
    }
}
