package threads;

public class Producer implements Runnable {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.put(i);
        }
    }
}
