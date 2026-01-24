package ThreadDemo;

public class Main {
    static void main() {
        ThreadExtendsMethod threadExtendsMethod = new ThreadExtendsMethod();
        threadExtendsMethod.start();
        ThreadExtendsMethod threadExtendsMethod2 = new ThreadExtendsMethod();
        threadExtendsMethod2.start();

        ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable();
        Thread t1 = new Thread(threadUsingRunnable);
        t1.start();
        Thread t2 = new Thread(threadUsingRunnable);
        t2.start();

        threadUsingRunnable.print();


        Runnable threadUsingAny = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running: " + Thread.currentThread().getName());
            }
        };



        Runnable threadUsingFI = () -> System.out.println("Thread running: " + Thread.currentThread().getName());
        Thread t = new Thread(threadUsingFI);
        t.start();
    }
}
