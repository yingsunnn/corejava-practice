package com.ying.lambda.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car("car1", 2001),
                new Car("car2", 2002),
                new Car("car3", 2003),
                new Car("car4", 2004));

        Car car = new Car("car", 2019);


        cars.sort((car1, car2) -> car1.getYear() > car2.getYear() ? 1 : -1);

        cars.sort(Car::compareByYear);

        cars.sort(car::compareByYear2);

        cars.sort(Car::compareByYear3);
        cars.forEach(Car::toString2);

        Car car5 = Car.create(Car::new);

        cars.forEach(System.out::println);
    }
}
