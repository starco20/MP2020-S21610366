package com.multiplatform;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
//1
    public String getFirstName(String firstName){
        return this.firstName;
    }
//2
    public String getLastName(String lastName){
        return this.lastName;
    }
//3
    public int getAge() {
        return this.age;
    }
//4
    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }
//5
    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }
//6
    public int setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100)
        {
          return 0;
        }else {

        return age;
        }
    }
//7
    public boolean isTeen (){
        if (age < 20 && age > 12)
        {
            return true;
        }
        else {
            return false;
        }
    }
//8
    public String getFullName(){
        String full = firstName + lastName;
        return full;
    }
}
