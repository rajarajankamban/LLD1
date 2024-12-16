package oops.semaphores;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<IPhone> store = new LinkedList<>();
        Producer p1 = new Producer(store, "P1");
        Producer p2 = new Producer(store, "P2");
        Producer p3 = new Producer(store, "P3");
        Producer p4 = new Producer(store, "P4");
        Producer p5 = new Producer(store, "P5");


        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        Thread tp4 = new Thread(p4);
        Thread tp5 = new Thread(p5);

        Consumer c1 = new Consumer(store, "C1");
        Consumer c2 = new Consumer(store, "C2");
        Consumer c3 = new Consumer(store, "C3");
        Consumer c4 = new Consumer(store, "C4");
        Consumer c5 = new Consumer(store, "C5");

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);
        Thread tc5 = new Thread(c5);


        tc1.start();
        tp1.start();
        tc2.start();
        tp2.start();
        tc3.start();
        tp3.start();
        tc4.start();
        tp4.start();
        tc5.start();
        tp5.start();







    }

}
