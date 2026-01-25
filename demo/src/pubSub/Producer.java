package pubSub;

class Producer implements Runnable {
    private final BoundedBuffer buffer;
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(100); // simulate work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

