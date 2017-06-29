package homework.threads;

public class Consumer2 implements Runnable {
    MyQueue2 myQueue;

    public Consumer2(MyQueue2 myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.get();
        }
    }
}

