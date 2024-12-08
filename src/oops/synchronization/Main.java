package oops.synchronization;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){

        HelloWorld h= new HelloWorld(0);
        Thread t = new Thread(h);
        t.start();

        System.out.println("Hello world:" + Thread.currentThread().getName());


        Executor e = Executors.newFixedThreadPool(10);
        for(int i=1;i<100;i++) {
            e.execute(new HelloWorld(i));
        }


    }
}
