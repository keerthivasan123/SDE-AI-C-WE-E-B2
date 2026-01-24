package ThreadDemo;

public class ThreadExtendsMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }


}
