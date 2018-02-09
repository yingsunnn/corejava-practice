package com.ying.default_method;

public class MyClient extends  MyParentClass1 implements MyInterface1/*, MyInterface2*/ {

    public static void main(String[] args) {
        new MyClient().method1();
        // will print "My parent class 1 method 1"
    }
}
