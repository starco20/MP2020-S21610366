package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    Car toyota = new Car();
	    toyota.setModel("mitsubishi");
        System.out.println("Nape toyota = "+toyota.getModel());

        Car nissan = new Car();
        nissan.setModel("ngengeng");
        System.out.println("Nissan = "+nissan.getModel());

        Car toy = new Car();
        toy.setModel("Aoi");
        System.out.println("A1 = "+toy.getModel());
    }
}
