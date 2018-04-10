package com.ying.algorithm;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Steps {

    public static void main(String[] args) {
        Steps steps = new Steps();

        System.out.println(steps.getWays());
    }

    public List<Long> getWays () {
        Stream<Long> steps = Stream.generate(new StepSupplier());
        return steps.limit(50).collect(Collectors.toList());
    }

    class StepSupplier implements Supplier<Long> {
        Long a = null;
        Long b = null;
        Long c = null;
        Long temp = null;

        @Override
        public Long get() {
            if (a == null) {
                a = 1l;
                return a;
            } else if (b == null) {
                b = 2l;
                return b;
            } else if (c == null) {
                c = 3l;
                return c;
            } else {
                temp = a + b + c;
                a = b;
                b = c;
                c = temp;
                return c;
            }
        }
    }
}
