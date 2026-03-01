package dsa.queue;


import java.util.Scanner;

public class MainArrayQueue {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        ArrayQueue queue = new ArrayQueue(capacity);

        while (true) {

            System.out.println("\nChoose operation:");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("3 - Peek");
            System.out.println("4 - Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter value to enqueue: ");
                        int value = sc.nextInt();
                        queue.enqueue(value);
                        System.out.println("Enqueued: " + value);
                        break;

                    case 2:
                        int popped = queue.dequeue();
                        System.out.println("Dequeued: " + popped);
                        break;

                    case 3:
                        int top = queue.peek();
                        System.out.println("Top element: " + top);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
