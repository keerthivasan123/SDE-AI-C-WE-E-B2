package pubSub;

class Consumer implements Runnable {
    private final BoundedBuffer buffer;
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(150); // simulate work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

