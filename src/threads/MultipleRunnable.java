package threads;

public class MultipleRunnable implements Runnable {
    public void run() {
        for (int x = 0; x < 3; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
        }
    }
}
