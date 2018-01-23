package threads;

public class DeadlockRisk implements Runnable {
    private static class Resource {
        private int value;
    }

    private Resource scissors = new Resource();
    private Resource paper = new Resource();

    public void doSun() {
        synchronized (scissors) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяла ножницы");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName()
                        + " взяла бумагу");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает солнышко");
            }
        }
    }

    public void doCloud() {
        synchronized (paper) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяла бумагу");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName()
                        + " взяла ножницы");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает облачко");
            }
        }
    }

    public void run() {
        doSun();
        doCloud();
    }

    public static void main(String[] args) {
        DeadlockRisk job = new DeadlockRisk();
        Thread masha = new Thread(job, "Маша");
        Thread dasha = new Thread(job, "Даша");
        masha.start();
        dasha.start();
    }
}
