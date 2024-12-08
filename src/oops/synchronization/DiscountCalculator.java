package oops.synchronization;

import java.util.concurrent.Callable;

public class DiscountCalculator implements Callable<Double> {

    private int productId;

    DiscountCalculator(int id) {
        productId = id;
    }

    @Override
    public Double call() {
        System.out.println("Discount for Product ID : " + productId + "Thread : " + Thread.currentThread().getName());
        return 10.00;
    }
}
