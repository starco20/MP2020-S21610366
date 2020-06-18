package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sum(1,2,5,1);
    }
    public static int sum(int a, int b){
        int c = a +b;
        return c;
    }
    public static int sum(int a, float b){
        return a + (int) b;
    }

    public static int sum(int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    public static int sum(int a, int b, int c ,int d){
        int result = a + + b + c + d;
        return result;
    }
}
