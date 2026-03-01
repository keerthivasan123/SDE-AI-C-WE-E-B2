package dsa.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    // get
    public int get(int key){
        if(!map.containsKey(key)){
            System.out.println("Element not present");
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    // put
    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        Node newNode = new Node(key, value);
        map.put(key, newNode);
        insertToFront(newNode);

        if(map.size() > capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }

    // remove
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // addFirst
    private void insertToFront(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
}
