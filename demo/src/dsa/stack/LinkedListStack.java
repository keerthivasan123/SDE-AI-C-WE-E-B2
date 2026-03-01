package dsa.stack;

public class LinkedListStack {
    Node top;

    // push
    public void push(int ele){
        Node newNode = new Node(ele);
        newNode.next = top;
        top = newNode;
    }

    // pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        Node removedNode = top;
        top = top.next;
        return removedNode.data;
    }
    // peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    public boolean isEmpty(){
        return top == null;
    }
}
