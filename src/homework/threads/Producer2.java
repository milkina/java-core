package homework.threads;

public class Producer2 implements Runnable {
    MyQueue2 myQueue;

    public Producer2(MyQueue2 myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.put("String "+i);
        }
    }
}
