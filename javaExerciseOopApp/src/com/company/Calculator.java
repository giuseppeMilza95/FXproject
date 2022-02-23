package com.company;

public class Calculator {
    private int number;
    private int number2;
    private Sum sum;

    public Calculator(int number, int number1) {
        this.number = number;
        this.number2 = number1;
    }
    public  double average (){
        return Sum.sum(number,number2)/2;
    }

}
