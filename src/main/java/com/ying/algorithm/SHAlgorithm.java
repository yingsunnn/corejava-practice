package com.ying.algorithm;

public class SHAlgorithm {

    String[] array = new String[100];

    int last = -1;

    public static void main(String[] args) {
        SHAlgorithm shAlgorithm = new SHAlgorithm();

        shAlgorithm.push("1111");
        shAlgorithm.push("2222");
        shAlgorithm.push("3333");

        System.out.println(shAlgorithm.pop());
        System.out.println(shAlgorithm.pop());
        System.out.println(shAlgorithm.pop());
        System.out.println(shAlgorithm.pop());

        shAlgorithm.push("4444");
        System.out.println(shAlgorithm.pop());
        System.out.println(shAlgorithm.pop());
    }

    public void push (String string) {
        array[++last] = string;
    }

    public String pop () {
        if (last < 0)
            return null;
        return array[last--];
    }
}
