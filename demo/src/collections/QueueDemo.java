package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    // T - O(1) , S - O(n) , n is size of queue.
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        // T - O(1)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        // 40 30 20 10
        // T - O(1)
        System.out.println(queue.peek());
        System.out.println(queue);
        // T - O(1)
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
