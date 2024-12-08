package oops.synchronization;

import java.util.concurrent.Callable;

public class MRPCalculator implements Callable<Integer> {

    private int productId;

    MRPCalculator(int id) {
        productId = id;
    }

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("MRP for Product ID : " + productId + "Thread : " + Thread.currentThread().getName());
        return 100;
    }
}
