package oops.synchronization;

public class Substractor implements Runnable {
    private Counter count;

    public Substractor(Counter count) {
        this.count = count;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.setCount(count.getCount() - 1);
        }
    }
}
