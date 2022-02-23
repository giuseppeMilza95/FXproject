package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Utilities ut = new Utilities();
        //System.out.println(ut.removePairs("ABBCCDDF"));
        System.out.println(new Utilities().removePairs("AABHDGCHF"));
        printString("Hello");
    }


    public static void printString(String source){
        char [] array = source.toCharArray();
        for (char letter : array){
            System.out.println(letter);
        }

        List al = Arrays.asList(array);

        List<char[]> array3 = new ArrayList<>(Arrays.asList(array));
        for (char[] letter : array3){

            System.out.println(letter);
        }
    }
}
