package oops.synchronization;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        // Runnable example
//        HelloWorld h = new HelloWorld(0);
//        Thread t = new Thread(h);
//        t.start();
//
//        System.out.println("Hello world:" + Thread.currentThread().getName());

//
//        // Thread pool example
//        Executor e = Executors.newFixedThreadPool(10);
//        for (int i = 1; i < 100; i++) {
//            e.execute(new HelloWorld(i));
//        }
//
//
        // Callable example
        MRPCalculator productMRP = new MRPCalculator(11);
        DiscountCalculator productDiscountCalc = new DiscountCalculator(11);
        ExecutorService e1 = Executors.newFixedThreadPool(2);
        Future<Integer> futureMrp = e1.submit(productMRP);
        Future<Double> futureDiscount = e1.submit(productDiscountCalc);


        Integer mrp = futureMrp.get();
        System.out.println("MRP Thread : " + Thread.currentThread().getName() + " " + mrp);
        Double discount = futureDiscount.get();
        System.out.println("Discount Thread : " + Thread.currentThread().getName() + " "+  discount);
        double finalPrice = mrp - (mrp * discount / 100);

        System.out.println("Final price: " + finalPrice + " " + Thread.currentThread().getName());


    }
}
