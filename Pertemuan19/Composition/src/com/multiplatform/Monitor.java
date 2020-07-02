package com.multiplatform;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolutionl;

    public Monitor(String model, String manufacture, int size, Resolution nativeResolutionl) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolutionl = nativeResolutionl;
    }

    public void drawPixelAt(int y,int x,String color){
        System.out.println("Drawing pixel at" + x +" ," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolutionl() {
        return nativeResolutionl;
    }
}
