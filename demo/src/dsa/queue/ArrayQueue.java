package dsa.queue;

public class ArrayQueue {
    private int size, capacity, front, rear;
    private int[] arr;

    ArrayQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    // enqueue
    public void enqueue(int ele){
        if(size == capacity) {
            System.out.println("Queue is Full !!!");
            return;
        }

        rear++;
        arr[rear] = ele;
        size++;
    }

    // dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty..");
            return -1;
        }

        int removedEle = arr[front];
        front++;
        size--;
        return removedEle;
    }

    // peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty..");
            return -1;
        }

        return arr[front];
    }

    // isEmpty
    public boolean isEmpty(){
        return size == 0;
    }
}
