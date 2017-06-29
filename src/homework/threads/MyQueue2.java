package homework.threads;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue2<T> {
    Queue<T> queue = new ArrayDeque<>();

    public synchronized T get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Пoлyчeнo: %s потоком %s\n", queue.peek(), Thread.currentThread().getName());
        return queue.poll();
    }

    public synchronized void put(T t) {
        queue.offer(t);
        System.out.println("Oтпpaвлeнo: " +t);
        notifyAll();
    }
}
