package quality.matrixes;

import java.util.Arrays;

public class MatrixOOP {
    private int[][] array;
    private int rows;
    private int columns;

    public MatrixOOP(int[][] array) {
        this.array = array;
        this.rows = array.length;
        this.columns = array[0].length;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Calculate matrix1 * coefficient1+ matrix2 * coefficient2;
     *
     * @return an int[][] array
     */
    private static MatrixOOP calculateExample(MatrixOOP[] matrixGroup, int[] coefficients) {
        MatrixOOP matrix1Multiplied = matrixGroup[0].multiply(coefficients[0]);
        MatrixOOP matrix2Multiplied = matrixGroup[1].multiply(coefficients[1]);
        return matrix1Multiplied.getSum(matrix2Multiplied);
    }

    private MatrixOOP getDifference(MatrixOOP matrix2) {
        int[][] difference = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                difference[i][j] = this.getArray()[i][j] - matrix2.getArray()[i][j];
            }
        }
        return new MatrixOOP(difference);
    }

    private void print() {
        System.out.println(Arrays.deepToString(this.getArray()));
    }

    private MatrixOOP getSum(MatrixOOP matrix) {
        int[][] sum = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                sum[i][j] = this.getArray()[i][j] + matrix.getArray()[i][j];
            }
        }
        return new MatrixOOP(sum);
    }

    private MatrixOOP multiply(int coefficient) {
        int[][] result = new int[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); ++i) {
            for (int j = 0; j < this.getColumns(); ++j) {
                result[i][j] = this.getArray()[i][j] * coefficient;
            }
        }
        return new MatrixOOP(result);
    }

    public static void main(String[] args) {
        MatrixOOP matrix1 = new MatrixOOP(new int[][]{{1, 1, 1}, {1, 1, 1}});
        MatrixOOP matrix2 = new MatrixOOP(new int[][]{{2, 2, 2}, {2, 2, 2}});
        int coefficient = 10;

        MatrixOOP matrix2Multiplied = matrix2.multiply(coefficient);
        matrix2Multiplied.print();

        MatrixOOP sum = matrix1.getSum(matrix2);
        sum.print();

        MatrixOOP difference = matrix1.getDifference(matrix2);
        difference.print();

        MatrixOOP exampleResult = calculateExample(new MatrixOOP[]{matrix1, matrix2}, new int[]{5, 6});
        exampleResult.print();
    }
}
