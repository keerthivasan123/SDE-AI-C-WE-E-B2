package dsa.dequeue;

public class Dequeue {
    DNode head, tail;

    // addFirst
    public void addFirst(int ele){
        DNode newNode = new DNode(ele);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast
    public void addLast(int ele){
        DNode newNode = new DNode(ele);
        if(tail == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // removeFirst
    public int removeFirst(){
        if(head == null) {
            System.out.println("Deque is Empty !!");
            return -1;
        }

        DNode removedNode = head;
        head = head.next;
        if(head != null){
            head.prev = null;
        } else {
            tail = null;
        }

        return removedNode.data;
    }

    // removeLast
    public int removeLast(){
        if(tail == null){
            System.out.println("Deque is Empty !!");
            return -1;
        }

        DNode removedNode = tail;
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        } else {
            head = null;
        }

        return removedNode.data;
    }

}
