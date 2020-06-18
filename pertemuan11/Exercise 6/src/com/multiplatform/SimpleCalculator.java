package com.multiplatform;

public class SimpleCalculator {
        private double firstNumber, secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }

        public double getSecondNumber (){
            return this.secondNumber;
        }

        public double setFirstNumber(double firstNumber){
            this.firstNumber = firstNumber;
            return firstNumber;
        }

        public double setSecondNumber(double secondNumber){
            this.secondNumber = secondNumber;
            return secondNumber;
        }

        public double getAdditionResult(){
            double total = firstNumber + secondNumber;
            return total;
        }

        public double getSubtractionResult(){
            double totalsubstract = firstNumber - secondNumber;
            return totalsubstract;
        }
//
        public double getMultiplicationResult(){
            double totalMultiple = firstNumber * secondNumber;
            return totalMultiple;
        }
//
        public double getDivisionResult(){
            if (secondNumber == 0){
                return 0;
            }
            else {
                double totaldivine = firstNumber / secondNumber;
                return totaldivine;
            }
        }
}
