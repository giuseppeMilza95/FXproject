package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int [] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);
        System.out.println("min = " + returnedMin);
    }

    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter a number");
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArray;
    }

    public static int findMin(int [] array){
        // int min = Integer.MAX_VALUE;  can be done also in this way
        int min = array[0];
        for (int i = 0; i < array.length; i++){

            if (array[i] < min){

                min = array[i];
            }
        }
        return  min;
    }
}

