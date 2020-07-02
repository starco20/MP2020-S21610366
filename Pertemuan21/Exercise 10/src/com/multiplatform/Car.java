package com.multiplatform;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Engine is start");
    }

    public void accelerate(){
        System.out.println("You making a speed");
    }

    private void brake(){
        System.out.println("Brace you self");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
