package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.canBalance(new int[]{1, 1, 1, 1, 4}));

    }

    public  boolean canBalance(int[] nums) {
        int sum = 0;
        double arrayLength = nums.length;

        for (int i = 0; i < Math.round(arrayLength/2); i++){
            sum += nums[0];

        }

        double num  = nums.length - arrayLength;
        int sum2 = 0;
        for(int j = nums.length-1; j >= Math.round(arrayLength/2); j-- ){
            sum2 += nums[j];
        }
        if (sum == sum2){
            return true;
        }else{
            return false;
        }
    }
}




