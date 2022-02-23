package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] strs = {"flower","flow","flight"};
        longestCommonPrefix(strs);

    }

    public static String longestCommonPrefix(String[] strs) {
        int j =0;

        StringBuilder sb = new StringBuilder();
        for (int i =0; i < strs.length; i++){
            while(j < strs.length){
                strs[i].charAt(i);
                j++;
            }
            j = 0;
        }

        System.out.println(sb);
        return "";
    }

}
