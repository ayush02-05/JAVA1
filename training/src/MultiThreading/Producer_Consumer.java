public class Producer_Consumer {
    public static void main(String[] args) {
        final Object lock = new Object();
        final int[] data = new int[1]; // shared data
        final boolean[] available = {false}; // shared state

        // Producer thread using lambda
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (available[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    data[0] = i;
                    System.out.println("Produced: " + data[0]);
                    available[0] = true;
                    lock.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread using lambda
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (!available[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Consumed: " + data[0]);
                    available[0] = false;
                    lock.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
