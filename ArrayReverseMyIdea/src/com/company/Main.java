package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] array = {1,5,3,7,11,9,15};

//        System.out.println("array = " + Arrays.toString(array));
        reverse(array);
//        System.out.println("reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int [] array){
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        int temp;
        for (int i = 0; i < halfLength; i++){
            temp = array[i]; // store the value of index 0 to a temp variable
            array[i] = array[maxIndex - i]; // store the value ogf the max index to the Index max
            array[maxIndex - i] = temp;  // max index equals to the minimum index
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
