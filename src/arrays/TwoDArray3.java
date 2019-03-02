package arrays;

public class TwoDArray3 {
    public static void main(String[] args) {
        double[][] arrayTwoD = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };
        for (double[] arrayOneD : arrayTwoD) {
            for (double element : arrayOneD) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
