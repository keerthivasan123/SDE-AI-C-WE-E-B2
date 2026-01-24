package ThreadDemo;

class NumberPrinter {
    private int number = 1;
    private final int limit = 10;

    public synchronized void printOdd() {
        while (number <= limit) {
            if (number % 2 == 0) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Odd: " + number++);
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= limit) {
            if (number % 2 != 0) {
                try { wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Even: " + number++);
            notify();
        }
    }
}
