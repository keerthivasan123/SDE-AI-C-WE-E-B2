package functionInterfaceDemo;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}
