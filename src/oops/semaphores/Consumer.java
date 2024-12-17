package oops.semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<IPhone> store;
    private String name;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Consumer(Queue<IPhone> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.semaConsumer = semaConsumer;
        this.semaProducer = semaProducer;
    }


    @Override
    public void run() {
        while (true) {
            try {
                semaConsumer.acquire();
                if (!store.isEmpty()) {
                    store.remove();
                    System.out.println("Current size : " + store.size() + ", removing a Iphone by consumer : " + name);
                } else {
                    System.out.println("Store empty for consumer");
                }
                semaProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
