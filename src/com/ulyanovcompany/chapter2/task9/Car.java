package com.ulyanovcompany.chapter2.task9;

public class Car {

    private double distance;
    private double fuelLevel;
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.distance = 0;
        this.fuelLevel = 0;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void moveCar(double distance) {
        this.distance += distance;
        fuelLevel -= distance / fuelEfficiency;
    }

    public void refuel(double gallons) {
        fuelLevel += gallons;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

}
