package com.ying.algorithm;


import java.util.Arrays;
import java.util.List;

public class Charge {
    public static void main(String[] args) {
        int result = charge1(10);

//        int result = charge2(10, Arrays.asList(5,2,1));
        System.out.println("result is: " + result);
    }


    public static int charge1 (int i) {
        if (i == 0)
            return 1;
        if (i < 0)
            return 0;

        return charge1(i - 1) + charge1(i - 2) + charge1(i - 5);

    }

    public static int charge2(int num, List<Integer> coins){
        if (num == 0){
            return 1;
        }

        if (num < 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < coins.size(); i++){
            sum += charge2(num - coins.get(i), coins.subList(i, coins.size()));
        }
        return sum;
    }
}
