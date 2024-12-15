package oops.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private Counter count;
    private ReentrantLock mutex;

    public Adder(Counter count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            mutex.lock();
            count.setCount(count.getCount() + 1);
            mutex.unlock();
        }
    }


}
