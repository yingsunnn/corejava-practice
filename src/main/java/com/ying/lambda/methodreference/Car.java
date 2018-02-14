package com.ying.lambda.methodreference;

import java.util.function.Supplier;

public class Car {
    private String name;
    private int year;

    public Car () {

    }

    public Car (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static int compareByYear(Car car1, Car car2){
        return car1.getYear() > car1.getYear() ? 1 : -1;
    }

    public int compareByYear2(Car car1, Car car2){
        return car1.getYear() > car1.getYear() ? 1 : -1;
    }

    public int compareByYear3(Car car){
        return this.year > car.getYear() ? 1 : -1;
    }

    public static Car create (final Supplier<Car> carSupplier) {
        return carSupplier.get();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String toString2() {
        return name;
    }

    public int getYear() {
        return year;
    }

}
