package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String args[]) {
        Deque<String> stack = new ArrayDeque<String>();
        Deque<String> queue = new ArrayDeque<String>(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
