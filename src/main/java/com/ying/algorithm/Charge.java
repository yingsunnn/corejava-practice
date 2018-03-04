package com.ying.algorithm;

public class Charge {

    public static void main(String[] args) {
        System.out.println(ying(3));
    }

    static int ying(int num){
        if (num < 0){
            return 0;
        }
        if (num == 0)
            return 1;
        return ying(num-1) + ying(num-2);
    }
}
