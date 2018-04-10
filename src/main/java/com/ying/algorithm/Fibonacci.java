package com.ying.algorithm;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci1());

    }

    public List<Long> fibonacci1 () {
        Stream<Long> fibonacci = Stream.generate(new FibonacciSupplier());

        return fibonacci.skip(30).limit(10).collect(Collectors.toList());
    }

    private class FibonacciSupplier implements Supplier<Long> {

        Long a = null;
        Long b = null;
        Long temp = null;

        @Override
        public Long get() {

            if (a == null) {
                a = 0l;
                return a;
            } else if (b == null) {
                b = 1l;
                return b;
            } else {
                temp = a + b;
                b = temp;
                a = b;
                return temp;
            }
        }
    }
}
