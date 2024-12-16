package oops.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class Substractor implements Runnable {
    private Counter count;
//    private ReentrantLock mutex;


    public Substractor(Counter count) {
        this.count = count;
    }
//    public Substractor(Counter count, ReentrantLock mutex) {
//        this.count = count;
//        this.mutex = mutex;
//    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.class) { // we can pass any class here. But the same reference has to be mention in other places where we need lock
                count.setCount(count.getCount() - 1);
            }

        }
    }
}
