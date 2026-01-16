package defaultMethods;

public interface Top {
    void method1();
    void method2();

    default void method3(){
        System.out.println("Method 3");
    }
}
