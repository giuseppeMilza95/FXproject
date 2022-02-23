package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        reverseArray(myArray);
    }

    public static void reverseArray(int[] array){

        int start = 0;
        int temp;
        int end = array.length-1;

        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            end--;
            start ++;
        }
        System.out.println(Arrays.toString(array));



    }
}
