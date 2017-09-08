package threads;

public class SleepRunnableDemo {
    public static void main(String[] args) {
        SleepRunnable sleepRunnable = new SleepRunnable();

        Thread one = new Thread(sleepRunnable);
        one.setName("Fred");
        Thread two = new Thread(sleepRunnable);
        two.setName("Lucy");
        Thread three = new Thread(sleepRunnable);
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}
