package genericDemo;

public class Box<K> {
    K value;
    void setValue(K value) { this.value = value; }
    K getValue() { return value; }
}

