package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //1
        int re1 = (int) toMilesPerHour(75.114);
        System.out.println("toMilesPerHour = " + re1);
        //2
        printConversion(10.25);
    }

    public static double toMilesPerHour(double kiloMeterPerHour){
        if (kiloMeterPerHour <= 0){
            return -1;
        }
        double re= kiloMeterPerHour * 0.631;
        return re;
    }
    public static void printConversion (double kiloperhour){
        if (kiloperhour <= 0){
            System.out.println("Invalid Value");
        }
        else {
            int milesperHour = (int) (kiloperhour * 0.631);
            System.out.println("toMilesPerHour "+kiloperhour +" KM/h = " + milesperHour + " mi/h");
        }
    }
}