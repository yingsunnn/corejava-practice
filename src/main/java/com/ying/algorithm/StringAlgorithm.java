package com.ying.algorithm;

import java.util.Stack;

public class StringAlgorithm {

    public static String string = "1234567890";

    public static void main(String[] args) {
        System.out.println("1: " + test1());
        System.out.println("2: " + test2());
    }

    public static String test1() {
        char[] c = string.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = c.length - 1; i >= 0; i --) {
            result.append(c[i]);
        }

        return result.toString();
    }

    public static String test2() {
        Stack<String> stack = new Stack();

        for (char c : string.toCharArray()) {
            stack.push(String.valueOf(c));
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
