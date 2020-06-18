package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
    public static double area(double radius ){
        if (radius < 0) {
            System.out.println("since the parameter is negative");
            return -1;
        }
        else {
            double PI = 3.14;
            double r1 = radius * radius * PI;
            return r1;
        }

    }
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            System.out.println("since first the parameter is negative");
            return -1;
        }

        else {
            int z = (int) (x * y);
            System.out.println(x+" * "+y+" = "+z);
            return z;
        }

    }
}
