package com.company;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myIntegers = getIntegers(5); // define the length of the array
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);

        }
        System.out.println("The average is " + getAverage(myIntegers));


    }

    public static int [] getIntegers (int number){
        System.out.println("ENTER " + number + " integer values.\r"); // \r is used to insert the number in the next line
        int [] values = new int[number]; // set the length of the array passing the value of number
        for (int  i = 0; i < values.length; i++){
            values[i] = scanner.nextInt(); // adding the value in our array
        }
        return values;
    }

    public static double getAverage (int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
