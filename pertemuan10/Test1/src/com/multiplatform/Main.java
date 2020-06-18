package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //No1
        shoulddWakeUp(true,1);
        shoulddWakeUp(false,2);
        shoulddWakeUp(true,8);
        shoulddWakeUp(true,1);
    }

    public static boolean shoulddWakeUp(boolean barking, int hourOfDay){
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            System.out.println("since the hourOfDay parameter needs to be in a range 0-23.");
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            System.out.println(" should return false, since it's not before 8.");
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
                System.out.println("should return true");
                result = true;
            }
            else {
                System.out.println("since the dog is not barking");
                result = false;
            }
        }
        return result;
    }

    //no2
    public static void isCatPlaying (boolean summer, int temperature){
        if (){

        }
    }
}