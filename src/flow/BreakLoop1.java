package flow;

public class BreakLoop1 {
    public static void main(String args[]) {
        int i = 0, n = 100;

        while (i < n) {
            if (i == 10) {
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}

