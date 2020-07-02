package com.multiplatform;

public class Case {
    private String model;
    private String manufaturer;
    private String powerSupply;

    public Case(String model, String manufaturer, String powerSupply) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button is pressed ...");
    }

    public String getModel() {
        return model;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }
}
