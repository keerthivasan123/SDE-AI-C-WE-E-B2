package dsa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<Node> sets = new HashSet<>();
        sets.add(new Node(1));
        sets.add(new Node(1));
        sets.add(new Node(1));
        sets.add(new Node(2));
        sets.add(new Node(2));

        System.out.println(sets);
    }
}
