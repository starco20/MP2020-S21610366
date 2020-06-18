package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	char mychar = 'J';
	char myunicode = '\u004A';
    System.out.println(mychar);
    System.out.println(myunicode);
    char myotherunicode ='\u00AE';
    System.out.println(myotherunicode);

    boolean myfirstboo = true;
    boolean mysecondboo = false;
    boolean isLoggedIn = true;

    String myStri = "String";
    System.out.println("This is "+myStri);
    myStri = myStri + "2";
    System.out.println("This is " +myStri);
    myStri = myStri +" \u00AE";
    System.out.println("This is "+ myStri +" 2020");

        String mynum = "20.5";
        System.out.println("30.2"+mynum);
        int myIntnum = 30;
        mynum = mynum + myIntnum;
        System.out.println(mynum);
    }
}
