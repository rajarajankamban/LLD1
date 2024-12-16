package oops.semaphores;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<IPhone> store;
    private String name;

    public Producer(Queue<IPhone> store, String name) {
        this.store = store;
        this.name = name;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println("Current size : " + store.size() + ", adding a Iphone by producer : " + name);
            store.add(new IPhone());

        }
    }
}
