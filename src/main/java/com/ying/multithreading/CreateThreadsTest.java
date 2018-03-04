package com.ying.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CreateThreadsTest {

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread 1 is running.");
        }
    }

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread 2 is running.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Thread3 implements Callable<String> {
        @Override
        public String call() throws Exception {
            String str = "Callable Thread 3 is running.";

            System.out.println("Callable Thread 3 is running.");
            Thread.sleep(5000);

            return str;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        new Thread1().start();

//        new Thread(new Thread2()).start();

//        new Thread(() -> {
//            System.out.println("Thread 2 is running.");
//        }).start();

        FutureTask<String> future =
                new FutureTask(() ->"Callable Thread 3 is running.");
        Thread t2 = new Thread(future);
        t2.start();

        ThreadGroup tg = new ThreadGroup ("A");
        Thread t3 = new Thread(new Thread2());
        t3.start();

        Thread t1 = Thread.currentThread();

        System.out.println("t1 " + t1.getThreadGroup());
        System.out.println("t3 " + t3.getThreadGroup());

        System.out.println("exit.");
    }

}
