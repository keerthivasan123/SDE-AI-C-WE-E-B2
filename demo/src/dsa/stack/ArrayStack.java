package dsa.stack;

public class ArrayStack {
    private int[] arr;
    private int capacity;
    private int top = -1;

    ArrayStack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }

    // push
    public void push(int ele){
        if(top == capacity - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = ele;
    }

    // pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        int removedEle = arr[top];
        top--;
        return removedEle;
    }

    // peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
