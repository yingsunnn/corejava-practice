package com.ying.lambda.scope;

import java.util.function.Function;

public class LambdaScope {

    private String globalValue = "";

    public static void main(String[] args) {
        LambdaScope lambdaScope = new LambdaScope();

        lambdaScope.test1("value");
    }


    public void test1(String value) {

        Function<String, String> func1 = x -> {
            System.out.println(this);
//            value = "21";
            System.out.println(value);
            return x;
        };

        System.out.println(func1.apply(""));

    }

    public void test2() {
        int y = 1;
        Function<String, String> func1 = x -> {
            System.out.println(this);
//            y = "12";
            System.out.println("x:" + x + ", y: " + y);
            return x;
        };
        System.out.println(func1.apply(""));
    }

    public void test3 () {
        Function<String, String> func1 = x -> {
            System.out.println(this);
            globalValue = "123123";
            System.out.println("x:" + x + ", global value: " + globalValue);
            return x;
        };
    }

    public String toString() {
        return "Main";
    }
}
