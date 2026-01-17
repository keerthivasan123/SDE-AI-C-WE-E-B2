package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    static void main() {
        // Apple , Appla
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);
        minHeap.offer(1);

        System.out.println("===========Min Heap===========");
        System.out.println(minHeap.poll());
        System.out.println(minHeap);
        System.out.println(minHeap.poll());
        System.out.println(minHeap);
        System.out.println(minHeap.poll());
        System.out.println(minHeap);

        Queue<Integer> maxHeap = new PriorityQueue<>(
                (a, b) -> b - a
        );
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(1);

        System.out.println("===========Max Heap===========");
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap);
    }
}
