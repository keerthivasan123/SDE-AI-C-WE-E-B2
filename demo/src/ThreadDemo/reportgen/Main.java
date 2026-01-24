package ThreadDemo.reportgen;

import java.util.ArrayList;

class Report extends Thread {
    public void run() {
        System.out.println("Generating report...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Report generated");
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Report report = new Report();
        report.setPriority(Thread.MAX_PRIORITY);
        report.start();
        report.join();  // wait for report
        System.out.println("Sending email");

        var list = 10;

        ArrayList<Integer> arr = new ArrayList<>();
        var arrUsingVar = new ArrayList<Integer>();
    }
}

