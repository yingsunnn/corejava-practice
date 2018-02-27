package com.ying.multithreading;

import java.util.concurrent.TimeUnit;

public class MultithreadingTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First task started");
        });
        t1.start();
        t1.join();
        System.out.println("main thread");
    }
}
