package threads;

public class Consumer implements Runnable {
    MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.get();
        }
    }
}
