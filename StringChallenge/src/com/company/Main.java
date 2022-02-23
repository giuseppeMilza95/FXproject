package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "aabbcde";
        System.out.println(encode(str));
    }


    public static String encode(String str) {
        // stores output string
        String encode = "";
        int count;
// append current character and its count to the result
        for (int i = 0; i < str.length(); i++) {
            // count occurrences of character at index `i`
            count = 1;

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }

            encode += String.valueOf(count) + str.charAt(i);
        }
        return encode;
    }


}
