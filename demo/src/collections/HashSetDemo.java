package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    static void main() {
        Set<Integer> set = new HashSet<>();
        // O(1)
        set.add(23);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.add(3);
        set.add(3);
        set.add(4);
        set.add(23);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(23);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(23);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(23);
        set.add(3);
        // T - O(1)
        set.remove(3);

        // T- O(1)
        System.out.println(set.contains(1));
        System.out.println(set.size());

    }
}
