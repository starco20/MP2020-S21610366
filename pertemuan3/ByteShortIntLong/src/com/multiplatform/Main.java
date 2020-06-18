package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        int myvalue = 10000;

        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;
        System.out.println("My Max Value = " + myMaxValue);
        System.out.println("My Min Value = " + myMinValue);
        System.out.println("Overflow max value  = " + (myMaxValue + 1));
        System.out.println("Underflow min value = " + (myMinValue - 1));

        int myMaxIntTest = 2_512_251_93;

        byte myMaxValuebyte = Byte.MAX_VALUE;
        byte myMinValuebyte = Byte.MIN_VALUE;
        System.out.println("My Max Value byte = " + myMaxValuebyte);
        System.out.println("My Min Value byte = " + myMinValuebyte);

        long myMaxValuelong = Long.MAX_VALUE;
        long myMinValuelong = Long.MIN_VALUE;
        System.out.println("My Max Value long = " + myMaxValuelong);
        System.out.println("My Min Value long = " + myMinValuelong);

        short myMaxValueshort = Short.MAX_VALUE;
        short myMinValueshort = Short.MIN_VALUE;
        System.out.println("My Max Value = " + myMaxValueshort);
        System.out.println("My Min Value = " + myMinValueshort);
        
        long MyBiglongVlue = 1273981891723L;
        byte mynewByteValue = (byte) (myMinValuebyte / 2);
        short mynewshortValue = (short) (myMinValueshort  / 2);
    }
}
