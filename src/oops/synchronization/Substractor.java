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
            synchronized (Counter.class) {
                count.setCount(count.getCount() - 1);
            }

        }
    }
}
