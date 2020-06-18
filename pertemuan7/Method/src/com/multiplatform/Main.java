package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    printMessage("Jos");
	    int resl =addition(50,20);
        System.out.println("Result is = "+resl);
    }

    public static void printMessage(String nama){
        System.out.println("Hello "+nama);
    }

    public static int addition (int a, int b){
        if (a == 0 || b == 0){
            return -50;
        }
        int result = a + b;
        return result;

    }
}
