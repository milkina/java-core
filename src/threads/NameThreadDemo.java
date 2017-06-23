package threads;

public class NameThreadDemo {
    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        Thread tread1 = new Thread(nr);
        tread1.setName("First Thread");
        tread1.start();

        Thread tread2 = new Thread(nr, "Second Thread");
        tread2.start();
    }
}
