package ThreadDemo;

public class ThreadUsingRunnable extends Parent implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
