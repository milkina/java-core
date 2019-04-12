package collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Киев");
        queue1.offer("Харьков");
        queue1.offer("Львов");
        queue1.offer("Кременчуг");
        queue1.offer("Кременчуг");
        System.out.print("Priority queue с Comparable: ");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();

        PriorityQueue<String> queue2
                = new PriorityQueue<>(5, Collections.reverseOrder());
        queue2.offer("Киев");
        queue2.offer("Харьков");
        queue2.offer("Львов");
        queue2.offer("Кременчуг");
        queue2.offer("Кременчуг");
        System.out.print("Priority queue с Comparator: ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
