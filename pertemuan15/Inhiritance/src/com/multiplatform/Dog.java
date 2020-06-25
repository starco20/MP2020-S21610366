package com.multiplatform;

public class Dog extends Animal{

    private int eye;
    private int legs;
    private int tail;

    public Dog(String name, int height, int eye, int legs, int tail) {
        super(name, 1, 1, height);
        this.eye = eye;
        this.legs = legs;
        this.tail = tail;
    }

    public int getEye() {
        return eye;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    public void walk(int speed){
        System.out.println(getName()+" is walking with speed "+ speed);
    }

    public void run(int speed){
        System.out.println(getName()+ " is running with speed "+ speed);
    }

    @Override
    public void move(int speed) {
        if (speed <= 5){
            this.walk(speed);
        }else {
            this.run(speed);
        }
    }
}
