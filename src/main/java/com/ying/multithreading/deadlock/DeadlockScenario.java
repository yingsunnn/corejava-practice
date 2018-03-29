package com.ying.multithreading.deadlock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadlockScenario {

    private static String O1 = "O1";
    private static String O2 = "O2";

    public static void main(String[] args) {
//        test1();
        test2();

        List<String> list = null;

        if (list == null)
            list = new ArrayList<>();
        list.add("thread 1");

    }

    public static void test1() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(
                () -> {
                    synchronized (O1) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (O2) {
                            System.out.println(O1);
                            System.out.println(O2);
                        }
                    }
                }
        );

        executorService.submit(
                () -> {
                    synchronized (O2) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (O1) {
                            System.out.println(O2);
                            System.out.println(O1);
                        }
                    }
                }
        );
        executorService.shutdown();
    }

    public static void test2 () {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(
                () -> {
                    synchronized (O1) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (O2) {
                            System.out.println(O1);
                            System.out.println(O2);
                        }
                    }
                }
        );

        executorService.submit(
                () -> {
                    synchronized (O1) {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (O2) {
                            System.out.println(O2);
                            System.out.println(O1);
                        }
                    }
                }
        );

        executorService.shutdown();
    }



}
