package dsa.dequeue;

import java.util.Scanner;

public class MainDequeue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Dequeue deque = new Dequeue();

        while (true) {

            System.out.println("\nChoose operation:");
            System.out.println("1 - Add First");
            System.out.println("2 - Add Last");
            System.out.println("3 - Remove First");
            System.out.println("4 - Remove Last");
            System.out.println("5 - Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter value to add at front: ");
                        int val1 = sc.nextInt();
                        deque.addFirst(val1);
                        System.out.println("Added at front: " + val1);
                        break;

                    case 2:
                        System.out.print("Enter value to add at rear: ");
                        int val2 = sc.nextInt();
                        deque.addLast(val2);
                        System.out.println("Added at rear: " + val2);
                        break;

                    case 3:
                        int removedFront = deque.removeFirst();
                        System.out.println("Removed from front: " + removedFront);
                        break;

                    case 4:
                        int removedRear = deque.removeLast();
                        System.out.println("Removed from rear: " + removedRear);
                        break;

                    case 5:
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
