package threads;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Important job running in " + getName());
    }
}
