package com.ying.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
//        System.out.println(Optional.ofNullable("abcd").isPresent());

//        System.out.println(Optional.ofNullable(null).get());

//        System.out.println(Optional.ofNullable(null).isPresent());

//        Optional.<String>ofNullable(null).ifPresent(System.out::println);

//        System.out.println(Optional.ofNullable(null).orElse("value is null"));

//        System.out.println(Optional.ofNullable(null).orElseGet(()-> "value is null"));

//        System.out.println(Optional.ofNullable("123")
//                .orElseThrow(() -> new IllegalArgumentException("value cannot be null")));

//        System.out.println(Optional.ofNullable(null).get());

//        System.out.println(Optional.<String>ofNullable("bcd")
//                .filter(string -> "abc".equals(string))
//                .orElse("value not equals abc"));
//
        String string1 = "12";
//        Integer i = Optional.ofNullable(string1).map(Integer::new).orElse(0);
//
        Integer i1 = Optional.ofNullable(string1)
                .map(Integer::new)
                .orElseThrow(() -> new IllegalArgumentException("Invalid email address"));
        System.out.println(i1);
//
//
//        Optional.ofNullable("abc@abc.com")
//                .filter(string -> string.indexOf("@") > 0)
//                .filter(string -> string.indexOf(".com") > 0)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid email address"));

//        System.out.println(flatMapTest());


        System.out.println(Boolean.valueOf("true"));
    }

    static String flatMapTest () {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("abcdefg", 1230000));

        return Optional.ofNullable(cars)
                .filter(cars1 -> cars.size() > 0)
                .flatMap(cars1 -> Optional.ofNullable(cars1.get(0)))
                .map(car -> car.getName())
                .orElse("no cars");
    }


}
