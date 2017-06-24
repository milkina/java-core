package threads;

public class IsAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        System.out.println("Before starting: " + thread1.isAlive());
        thread1.start();
        System.out.println("After starting: " + thread1.isAlive());
        thread1.join();
        System.out.println("After thread completed: " + thread1.isAlive());
    }
}
