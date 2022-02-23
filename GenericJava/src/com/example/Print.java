package com.example;

public class Print <T extends Animals>{
    T valueToPrint;

    public T printValue(T valueToPrint){
        valueToPrint.printName();
        System.out.println("The value passed is: " + valueToPrint);
        return valueToPrint;
    }

}
