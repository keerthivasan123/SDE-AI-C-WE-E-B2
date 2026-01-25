package pubSub;

import java.util.LinkedList;
import java.util.Queue;
public class BoundedBuffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;
    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // wait if buffer is full
        }
        queue.add(item);
        System.out.println(Thread.currentThread().getName()
                + " produced: " + item);
        notifyAll(); // notify consumers
    }
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait if buffer is empty
        }
        int item = queue.poll();
        System.out.println(Thread.currentThread().getName()
                + " consumed: " + item);
        notifyAll(); // notify producers
        return item;
    }
}

