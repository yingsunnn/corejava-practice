package com.ying.lambda.collection;

import java.util.*;

public class CollectionNewMethodTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        list.add("3333");

        System.out.println(list);

        list.removeIf(string -> true);
        System.out.println(list);

        list.spliterator();

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.merge("2", "b", (v1, v2) -> v1 + v2);
        map.merge("2", "c", (v1, v2) -> {
            System.out.println("v1:" + v1);
            System.out.println("v2:" + v2);
            return null;
        });
        System.out.println(map);

        Map<Integer, Set<String>> map1 = new HashMap<>();
        map1.computeIfAbsent(1, v -> new HashSet<String>()).add("yi");
        map1.computeIfAbsent(1, v -> new HashSet<String>()).add("er");
        System.out.println(map1);

        Map<Integer, Set<String>> map2 = new HashMap<>();
        map2.compute(1, (key, value) -> new HashSet<String>()).add("one");
        map2.compute(1, (key, value) -> new HashSet<String>()).add("two");
        map2.compute(1, (key, value) -> null);


        System.out.println("map2");
        System.out.println(map2);


    }
}
