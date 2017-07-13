package flow;

public class BreakLoop1 {
    public static void main(String args[]) {
        int i = 0;

        while (i < 100) {
            if (i == 10 && i&2==0) {
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}

