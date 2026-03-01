package dsa.queue;

public class LinkedListQueue {
    Node front, rear;

    public void enqueue(int ele){
        Node newNode = new Node(ele);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }

        Node removedNode = front;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return removedNode.data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return -1;
        }

        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }
}
