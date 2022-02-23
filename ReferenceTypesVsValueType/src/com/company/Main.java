package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // Arrays.toString is used to prints the array,
        // basically converts all the elements from an array to string and avery element is separated with a ','.
        System.out.println("anotherArray = " + Arrays.toString(myIntArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(myIntArray));
        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int [] array){
        array [0] = 2;
        array = new int [] {1,2,3,4,5}; // when we use new is created a new array in a different place in memory (it points to a different memory location)
    }
}
