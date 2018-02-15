package com.ying.lambda.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamTest {

    public static void main(String[] args) {
        SteamTest steamTest = new SteamTest();
        steamTest.terminalMethod();
    }

    public void terminalMethod () {
        Consumer println = System.out :: println;

        Consumer<String> printlnUpperCase = string -> System.out.println(string.toUpperCase());
//        Stream.of("a", "b", "c", "d").forEach(printlnUpperCase);


//        Stream.of("a1", "b2", "c1", "d3")
//                .filter(string -> string.endsWith("1"))
//                .forEach(System.out :: println);


//        Stream.of(4, 1, 9, 7, 0).sorted().forEach(println);
//        Stream.of(4, 1, 9, 7, 0).sorted((i1, i2) -> i1 > i2 ? -1 : 1).forEach(println);

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).limit(7).forEach(println);

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).findFirst().ifPresent(System.out :: println);

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).findAny().ifPresent(println);

//        System.out.println(Stream.of("a", "B", "C", "D").anyMatch(string -> string.toLowerCase().equals("c")));

//        System.out.println(Stream.of("c", "C").allMatch(string -> string.toLowerCase().equals("c")));

        System.out.println(Stream.of("a", "b", "c", "d").noneMatch(string -> string.toLowerCase().equals("e")));
    }

}
