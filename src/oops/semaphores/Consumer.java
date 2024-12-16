package oops.semaphores;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<IPhone> store;
    private String name;

    public Consumer(Queue<IPhone> store, String name) {
        this.store = store;
        this.name = name;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println("Current size : " + store.size() + ", removing a Iphone by consumer : " + name);
            if (!store.isEmpty()) {
                store.remove();
            }
        }
    }
}
