package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be converted: ");
        int number = scanner.nextInt();
        ArrayList<Integer> binary = binaryConversion(number);
        reverseArray(binary);


    }

    public static ArrayList<Integer> binaryConversion(int number) {
        ArrayList<Integer> binaryForm = new ArrayList<Integer>();
        int reminder = number;

        while (number > 1) {

            reminder = number % 2;
            binaryForm.add(reminder);

            number /= 2;
            if (number == 1) {

                binaryForm.add(number);

                break;
            }
        }

        if (number == 0) {
            binaryForm.add(number);

        }

        return binaryForm;
    }


    public static void reverseArray(ArrayList<Integer> array) {
        for (int i = 0, j = array.size() - 1; i < j; i++) {
            array.add(i, array.remove(j));

        }
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
        }

    }


}


