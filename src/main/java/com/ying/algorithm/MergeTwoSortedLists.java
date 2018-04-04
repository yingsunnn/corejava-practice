package com.ying.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {

    static List<Integer> list1 = Arrays.asList(1, 50, 61);
    static List<Integer> list2 = Arrays.asList(1, 4, 5, 6, 62);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {

            if (i >= list1.size() && j < list2.size()) {
                list.add(list2.get(j++));
            } else if (j >= list2.size() && i < list1.size()) {
                list.add(list1.get(i++));
            } else {
                if (list1.get(i) < list2.get(j)) {
                    list.add(list1.get(i));
                    i++;
                } else {
                    list.add(list2.get(j));
                    j++;
                }
            }
        }

        System.out.println(list);
    }
}
