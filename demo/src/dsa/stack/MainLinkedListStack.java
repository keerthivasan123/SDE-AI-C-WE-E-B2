package dsa.stack;

import java.util.Scanner;

public class MainLinkedListStack {
    static void main() {
        Scanner sc = new Scanner(System.in);

        LinkedListStack stack = new LinkedListStack();

        while (true) {

            System.out.println("\nChoose operation:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = sc.nextInt();
                        stack.push(value);
                        System.out.println("Pushed: " + value);
                        break;

                    case 2:
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                        break;

                    case 3:
                        int top = stack.peek();
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
