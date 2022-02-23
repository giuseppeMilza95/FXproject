package com.example;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int [] digit = {1,2,3};
        int [] result = plusOne(digit);
        System.out.println(result);





    }


    public static int[] plusOne(int[] digits) {
        int result [] = digits;
        int sum = digits[digits.length-1] += 1;
        result[digits.length-1] = sum;
        return result;

    }


}