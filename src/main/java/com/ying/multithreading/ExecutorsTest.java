package com.ying.multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorsTest {

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable Thread 2 is running.");
        }
    }

    private static class Thread3 implements Callable<String> {
        @Override
        public String call() throws Exception {
            String str = "Callable Thread 3 is running.";
            System.out.println(str);
            return str;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Thread2());

        Future future = executor.submit(new Thread2());
        Future future1 = executor.submit(new Thread3());

            System.out.println(future.get());

            System.out.println(future1.get());

        executor.shutdown();
    }

    public void test () {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++){
            executorService.execute(() -> {//Runnable
                try {
                    int sec = new Random().nextInt(10);
                    TimeUnit.SECONDS.sleep(sec);
                    System.out.println(Thread.currentThread().getName() + " is running... sec: " + sec);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            executorService.submit(()->{ // Callable
                return null;
            });
            executorService.submit(()->{ // Runnable
                System.out.println("submit Runnable");
            });
        }
        executorService.shutdown();
    }
}
