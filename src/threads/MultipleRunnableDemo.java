package threads;

public class MultipleRunnableDemo {
    public static void main(String[] args) {
        // Make one Runnable
        MultipleRunnable multipleRunnable = new MultipleRunnable();

        Thread one = new Thread(multipleRunnable);
        Thread two = new Thread(multipleRunnable);
        Thread three = new Thread(multipleRunnable);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}
