package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue
                = new LinkedList<String>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        while (queue.size() > 0) {
            System.out.print(queue.poll() + " ");
        }
    }
}
