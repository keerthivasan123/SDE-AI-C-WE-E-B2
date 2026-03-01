package dsa.LRUCache;

import dsa.queue.ArrayQueue;

import java.util.Scanner;

public class LRUMain {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter LRU Cache capacity: ");
        int capacity = sc.nextInt();

        LRUCache lruCache = new LRUCache(capacity);

        while (true) {

            System.out.println("\nChoose operation:");
            System.out.println("1 - PUT");
            System.out.println("2 - GET");
            System.out.println("3 - Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter key : ");
                        int key = sc.nextInt();
                        System.out.print("Enter value : ");
                        int value = sc.nextInt();
                        lruCache.put(key, value);
                        System.out.println("LRU Cache added with : " + value);
                        break;

                    case 2:
                        System.out.print("Enter key : ");
                        key = sc.nextInt();
                        int popped = lruCache.get(key);
                        System.out.println("Get from LRU Cache : " + popped);
                        break;

                    case 3:
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
