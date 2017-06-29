package threads;

public class MyThreadTwo extends Thread {
    Thread t1;

    public MyThreadTwo() {
        System.out.println("MyThreadTwo create");
    }

    public void run() {
        System.out.println("MyThreadTwo start");
        try {
            System.out.println("MyThreadTwo waiting MyThreadOne finish…");
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished");
    }

    public void setThread1(Thread t) {
        this.t1 = t;
    }
}
