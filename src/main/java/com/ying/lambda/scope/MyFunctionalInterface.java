package com.ying.lambda.scope;

@FunctionalInterface
public interface MyFunctionalInterface {
    String operation (String value);

    default void defaultMethod (String string) {
        System.out.println("MyFunctionalInterface default method. " + string);
    }
}
