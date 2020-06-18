package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculato = new SimpleCalculator();
        calculato.setFirstNumber(5.0);
        calculato.setSecondNumber(4);
        //Add
        System.out.println("Add = "+calculato.getAdditionResult());
        //Substract
        System.out.println("Substract = "+calculato.getSubtractionResult());
        calculato.setFirstNumber(5.25);
        calculato.setSecondNumber(0);
        //Multiple
        System.out.println("Multiple = "+calculato.getMultiplicationResult());
        //Divide
        System.out.println("Divide = "+calculato.getDivisionResult());
    }
}
