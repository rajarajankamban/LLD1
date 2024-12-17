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
            synchronized (Producer.class) {
                if (store.size() <= 5) {
                    System.out.println("Current size : " + store.size() + ", adding a Iphone by producer : " + name);
                    store.add(new IPhone());
                }
            }
        }
    }
}

// Notes  - Even after restricting the store size , the threads are able to add more than 5 items
//Current size : 5, adding a Iphone by producer : P4
//Current size : 5, adding a Iphone by producer : P2
//Current size : 5, removing a Iphone by consumer : C4
//Current size : 7, removing a Iphone by consumer : C4
//Current size : 6, removing a Iphone by consumer : C4
// Can we solved using synchronized method

