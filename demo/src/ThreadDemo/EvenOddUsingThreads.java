package ThreadDemo;

public class EvenOddUsingThreads {
    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}
