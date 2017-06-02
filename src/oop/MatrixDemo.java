package oop;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println("Количество строк: " + matrix.getRows());
        System.out.println("Количество столбцов: " + matrix.getColumns());

        matrix.setArray(new double[][]{{1, 2}, {4, 6}});
        System.out.println("Количество строк: " + matrix.getRows());
        System.out.println("Количество столбцов: " + matrix.getColumns());
    }
}
