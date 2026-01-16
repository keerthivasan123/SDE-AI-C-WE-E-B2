package overriding;

public class Parent {
    protected void print() {
        System.out.println("Parent!!");
    }

    void print(int i) {
        System.out.println("Parent!!" + i);
    }

    void print(double i) {
        System.out.println("Parent!!" + i);
    }
}
