package com.ying.algorithm;

public class SHAlgorithm {
    private int size = 2;
    String[] array = new String[size];

    private int last = -1;

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
        if (last + 1 >= size) {
            resize();
        }

        array[++last] = string;
    }

    public String pop () {
        if (last < 0)
            return null;
        return array[last--];
    }

    private void resize () {
        size = size * 2;
        String[] newArray = new String[size];
        for (int i = 0 ; i < array.length ; i ++) {
            newArray[i] = array[i];
        }

        array = newArray;
        System.out.println("Resize to : " + array.length);
    }
}
