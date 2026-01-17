package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    static void main() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.addFirst(0);
        linkedList.addLast(4);

        System.out.println(linkedList);

        // 0 1 2 3 4
        // T - O(n)
        System.out.println(linkedList.get(2));

//        0 1 2 12 3 4
        // T - O(1)
        linkedList.add(3, 12);

        // T - O(1)
        linkedList.remove(0);

        System.out.println(linkedList);

    }
}
