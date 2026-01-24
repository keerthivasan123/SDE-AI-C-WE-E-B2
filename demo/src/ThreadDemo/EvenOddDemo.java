package ThreadDemo;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddDemo {
    public static void main(String[] args) {
        Thread even = new EvenThread();
        Thread odd = new OddThread();

        even.start();
        odd.start();
    }
}
