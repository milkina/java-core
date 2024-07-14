package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.print("Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.out.print("Queue: ");

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
