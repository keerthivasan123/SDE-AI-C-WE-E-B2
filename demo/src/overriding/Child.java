package overriding;

public class Child extends Parent{
    @Override
    void print() {
        System.out.println("Child!!");
    }
}
