package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegerArray = getInteger(5);
       // printArray(myIntegerArray);
        int [] sorted = sortIntegers(myIntegerArray);
        printArray(sorted);



    }

    public static int[] getInteger(int number) {

        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) { // BubbleSort
//        int[] sortedArray = new int[array.length]; // create a an array "sorted array" and we seth the length of our array passed in the method
//        for (int i = 0; i < array.length; i++) { // going through the contents of our array
//            sortedArray[i] = array[i]; // create a copy of the content of the array passed
//        }
        int [] sortedArray = Arrays.copyOf(array, array.length); // another way to copy the value of one array to a new one, it easier and there is less code to debug



        boolean flag = true;
        int temp;
        // element 0    50
        // element 1    160
        // element 2    40
        while (flag) { // continue the loop till when the flag is set to true
            flag = false; // we are going out of the loop when all the elements of the array are sorted
            for (int i = 0; i < sortedArray.length - 1; i++) { // we are going through our array sorted
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i]; // we store temporarily the values of our sorted array, Ex. temp now is equal to 50
                    sortedArray[i] = sortedArray[i + 1]; // we move the element to the i + 1 position to the sortedArray[i], Ex. we swap 50 with 160
                    sortedArray[i + 1] = temp; // set the temporarily back Ex. we set in the index + 1 as 50 (temp was set to 50)
                    flag = true;
                }


            }
        }
        return sortedArray;
    }


}

