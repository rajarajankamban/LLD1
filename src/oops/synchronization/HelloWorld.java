package oops.synchronization;

public class HelloWorld implements Runnable {
    int number;

    HelloWorld(int n) {
        number = n;
    }

    @Override
    public void run() {
        System.out.println(Integer.toString(number) + "Hello world from :" + Thread.currentThread().getName());
    }
}
