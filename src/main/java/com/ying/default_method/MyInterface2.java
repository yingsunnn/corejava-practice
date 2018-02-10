package com.ying.default_method;

public interface MyInterface2 {
    String s = "hello world.";

    default void method1(){
        System.out.println("My interface 1 method 1");
    };
}
