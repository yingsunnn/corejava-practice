package com.ying.lambda.stream;

public class CarDTO {

    public CarDTO () {

    }

    public CarDTO (String name) {
        this.name = name;
    }

    private String name;
    private int milage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "CarDTO name: " + name;
    }
}
