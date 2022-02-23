package com.company;

public class Main {

    public static void main(String[] args) {
        // int[] myIntArray = new int[10]; // to create an array
        //int[] myIntArray = {1, 2,3,  4, 5, 6, 7, 8, 9, 10}; // can we declare an arrat and inserting more values opening {} and inserting inside the values
       int [] myIntArray = new int [25];

        // myIntArray[0] = 45; // store the value in index 5 (array starts always from 0)
       // myIntArray[1] = 476;
       // myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];

        //System.out.println(myIntArray[0]);// prints value of index position 5
        //System.out.println(myIntArray[6]);
        //System.out.println(myIntArray[8]);

        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10; // update the element 1 in our array and multiplying it by 10
        }

        printArray(myIntArray);

    }

    public  static void printArray(int [] array){
        for (int i = 0; i < array.length; i ++){
            System.out.println("Element " + i + ", value is  " + array[i]);
        }
    }
}
