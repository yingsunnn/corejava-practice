package com.ying.default_method;

public class MyClient extends MyParentClass1 implements MyInterface1, MyInterface2 {

    public static void main(String[] args) {
        MyClient myClient = new MyClient();
        myClient.method1();
        // will print "My parent class 1 method 1"

        MyClient.staticMethod1();

        MyInterface1.staticMethod1();
    }

    @Override
    public void method1() {

    }

    public static void staticMethod1() {
        System.out.println("my client static method 1");
    }
}
