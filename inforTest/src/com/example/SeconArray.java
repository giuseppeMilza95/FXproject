package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeconArray {


    public static void main(String[] args) {
        String [] arrayA = null;
        String [] arrayB ={"B", "f", "A", null,"d"};
        System.out.println(isInBoth("B",arrayA, arrayB));
    }

    public static boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
            // enclose the code between try and catch block to check if the
            // Array is not null, if it is null it will return false and print a message in the console.

        try {

            //Converting the array into an ArrayList to simply the process of checking in both arrays
            List<String> arrayAList = new ArrayList<>(Arrays.asList(arrayA));
            List<String> arrayBList = new ArrayList<>(Arrays.asList(arrayB));
            //check if the ArrayAList and ArrayBList contain the value, if yes return true, else return false;
            if (arrayAList.contains(value) && arrayBList.contains(value)) {
                System.out.println("Found!");
                return true;

            }

        }catch(NullPointerException e){
            System.out.println("The array is null");
            return false;
        }
        System.out.println("Not Found!");
        return false;
    }

}
