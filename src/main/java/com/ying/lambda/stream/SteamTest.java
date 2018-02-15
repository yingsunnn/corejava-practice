package com.ying.lambda.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamTest {

    public static void main(String[] args) {
        SteamTest steamTest = new SteamTest();
//        steamTest.terminalMethod();
        steamTest.collectMethod();
    }

    public void terminalMethod () {
        Consumer println = System.out :: println;

        Consumer<String> printlnUpperCase = string -> System.out.println(string.toUpperCase());
        Stream.of("a", "b", "c", "d").forEach(printlnUpperCase);


        Stream.of("a1", "b2", "c1", "d3")
                .filter(string -> string.endsWith("1"))
                .forEach(System.out :: println);


        Stream.of(4, 1, 9, 7, 0).sorted().forEach(println);
        Stream.of(4, 1, 9, 7, 0).sorted((i1, i2) -> i1 > i2 ? -1 : 1).forEach(println);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).limit(7).forEach(println);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).findFirst().ifPresent(System.out :: println);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).findAny().ifPresent(println);

        System.out.println(Stream.of("a", "B", "C", "D").anyMatch(string -> string.toLowerCase().equals("c")));

        System.out.println(Stream.of("c", "C").allMatch(string -> string.toLowerCase().equals("c")));

        System.out.println(Stream.of("a", "b", "c", "d").noneMatch(string -> string.toLowerCase().equals("e")));
    }

    public void collectMethod () {
        List<Car> cars = Arrays.asList(new Car("car1", 2200), new Car("car2", 36000), new Car("car3", 102));

        List<CarDTO> carDTOs = cars.stream().map(car -> new CarDTO(car.getName() + " DTO")).collect(Collectors.toList());

        System.out.println(carDTOs);

        System.out.println(Stream.of("Eric", "Peter").collect(Collectors.joining(" and ", "Both ", " are my firends.")));


//        IntSummaryStatistics milageSummaryStatistics = cars.stream().collect(Collectors.summarizingLong(car -> car);

//        System.out.println(milageSummaryStatistics);


        Map<String, Car> carMap = cars.stream().collect(Collectors.toMap(car -> car.getName(), car -> car));
        System.out.println(carMap);

    }

    public static CarDTO entityToDTO (Car car) {
        return new CarDTO(car.getName() + " DTO");
    }

}
