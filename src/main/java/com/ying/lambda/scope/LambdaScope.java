package com.ying.lambda.scope;

import java.util.function.Function;

public class LambdaScope {

    private String global;

    public void test(String value) {
        String internal = null;

        Function<String, String> func1 = x -> {
//            String internal = "";  //编译报错

//            value = "value"; //编译报错
            System.out.println(value);

            global = "global";
            System.out.println(global);

//            internal = "internal"; // 编译报错
            System.out.println(internal);
            return x;
        };

        System.out.println(func1.apply("2112"));
    }

    public void test2() {
        Function<String, String> func1 = x -> {
            System.out.println(this.global);
            return x;
        };
        System.out.println(func1.apply("2121"));
    }
}
