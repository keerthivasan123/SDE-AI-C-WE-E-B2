package dsa;

import java.util.Objects;

public class Node {
    int a;

    public Node(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return a == node.a;
    }

    @Override
    public int hashCode() {
        return a;
    }
}
