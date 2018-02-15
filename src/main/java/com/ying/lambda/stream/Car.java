package com.ying.lambda.stream;

public class Car {

    private String name;
    private int milage;

    public Car () {

    }

    public Car (String name) {
        this.name = name;
    }

    public Car (String name, int milage) {
        this.name = name;
        this.milage = milage;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarDTO name: " + name;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
}
