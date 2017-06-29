package threads;

public class ProducerDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        Consumer consumer = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);

        t1.start();
        t2.start();
    }
}
