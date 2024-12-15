package oops.synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

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
//        MRPCalculator productMRP = new MRPCalculator(11);
//        DiscountCalculator productDiscountCalc = new DiscountCalculator(11);
//        ExecutorService e1 = Executors.newFixedThreadPool(2);
//        // Submit will add it to ExecutorQueue
//        Future<Integer> futureMrp = e1.submit(productMRP);
//        Future<Double> futureDiscount = e1.submit(productDiscountCalc);
//
//        System.out.println("Before call from thread : " + Thread.currentThread().getName() + ", Time : " + LocalDateTime.now());
//
//        Integer mrp = futureMrp.get();
//        System.out.println("After MRP Thread : " + Thread.currentThread().getName() + " " + mrp + ", Time : " + LocalDateTime.now());
//        Double discount = futureDiscount.get();
//        System.out.println("After Discount Thread : " + Thread.currentThread().getName() + " " + discount + ", Time : " + LocalDateTime.now());
//        double finalPrice = mrp - (mrp * discount / 100);
//
//        System.out.println("Final price: " + finalPrice + " " + Thread.currentThread().getName());

        // ----  Discount calculation will be done first -----
//        Discount for Product ID : 11Thread : pool-1-thread-2
//        Before call from thread : main, Time : 2024-12-08T20:08:24.426796800
//        MRP for Product ID : 11Thread : pool-1-thread-1
//        After MRP Thread : main 100, Time : 2024-12-08T20:08:29.422809100
//        After Discount Thread : main 10.0, Time : 2024-12-08T20:08:29.436819200
//        Final price: 90.0 main


        // Synchronization Example

        Counter c = new Counter(0);
        ReentrantLock mutex  = new ReentrantLock();
        Adder adder = new Adder(c,mutex);
        Substractor substractor = new Substractor(c,mutex);

        Thread addThread = new Thread(adder);
        Thread substractorThread = new Thread(substractor);
        addThread.start();
        substractorThread.start();
        // Stops the main thread until the current thread is completed and finished.
        addThread.join();
        substractorThread.join();

        System.out.println("Final counter " + c.getCount());
    }
}
