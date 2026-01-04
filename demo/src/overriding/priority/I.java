package overriding.priority;

interface I {
    default void show() {
        System.out.println("Interface");
    }
}

