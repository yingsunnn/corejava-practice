package com.ying.default_method;

public interface MyInterface1 {
    default void method1(){
        System.out.println("My interface 1 method 1");
    };

    static void staticMethod1() {
        System.out.println("My interface 1 static method 1");
    }


}
