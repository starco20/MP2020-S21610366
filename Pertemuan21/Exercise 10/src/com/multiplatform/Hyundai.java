package com.multiplatform;

public class Hyundai extends Car{

    public Hyundai(String name, boolean engine, int cylinders, int wheels) {
        super(name, engine, cylinders, wheels);
    }

    @Override
    public void startEngine(){
        System.out.println(getName()+"Engine is starting");
    }

    @Override
    public void accelerate(){
        System.out.println(getName()+" is speeding up");
    }

    @Override
    public void brake(){
        System.out.println(getName()+" is going to slow");
    }
}
