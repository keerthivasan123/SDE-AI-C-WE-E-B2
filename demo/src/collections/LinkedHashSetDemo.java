package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    static void main() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(100);
        set.add(1);


        System.out.println(set);
        System.out.println(set.size());

    }
}
