package arrays;

public class Average {
    public static void main(String args[]) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Average is " + result / nums.length);
    }
}
