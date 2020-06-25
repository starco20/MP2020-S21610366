package com.multiplatform;

public class Fish extends Animal{

    private int eye;
    private int fins;

    public Fish(String name, int height, int eye, int fins){
        super(name,1,1, height);
        this.eye = eye;
        this.fins = fins;
    }

    @Override
    public void eat() {
        System.out.println(getName() +"  is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is resting");
    }

    private void swim(int speed){
        System.out.println(getName()+" is swiming with speed " + speed);
    }

    @Override
    public void move(int speed) {
        this.swim(speed);
    }

    public int getEye() {
        return eye;
    }

    public int getFins() {
        return fins;
    }
}
