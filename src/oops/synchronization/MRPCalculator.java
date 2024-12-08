package oops.synchronization;

import java.util.concurrent.Callable;

public class MRPCalculator implements Callable<Integer> {

    private int productId;

    MRPCalculator(int id) {
        productId = id;
    }

    @Override
    public Integer call() {
        System.out.println("MRP for Product ID : " + productId + "Thread : " + Thread.currentThread().getName());
        return 100;
    }
}
