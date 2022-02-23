package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {
        // Mapping the values for the roman symbol
        Map<Character, Integer> symbolMapping = new HashMap<>();
        symbolMapping.put('I', 1);
        symbolMapping.put('V', 5);
        symbolMapping.put('X', 10);
        symbolMapping.put('L', 50);
        symbolMapping.put('C', 100);
        symbolMapping.put('D', 500);
        symbolMapping.put('M', 1000);

        int result = 0;
        for(int i = 0; i < s.length(); i++){
            if ((i < s.length()-1) && symbolMapping.get(s.charAt(i)) <  symbolMapping.get(s.charAt(i+1))){
                result -= symbolMapping.get(s.charAt(i));
            }
            else {
                result += symbolMapping.get(s.charAt(i));
            }
        }
        return result;
    }
}
