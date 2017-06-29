package homework.threads;

public class ProducerDemo2 {
    public static void main(String[] args) {
        MyQueue2 myQueue = new MyQueue2();

        Thread t1 = new Thread(new Consumer2(myQueue));
        Thread t2 = new Thread(new Consumer2(myQueue));
        Thread t3 = new Thread(new Producer2(myQueue));

        t1.setName("consumer1");
        t2.setName("consumer2");

        t1.start();
        t2.start();
        t3.start();
    }
}
