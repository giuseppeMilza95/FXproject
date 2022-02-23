package com.example;

public class Main {

    public static void main(String[] args) {
        /**our answer should not rely on multithreading.

                Input:
        ordered list of commit IDs ([123, 127, 130, 137,...])

        Available API:
         */

        int [] array = {1,2,3,8,7,12,11};
        System.out.println(findBadCommit(array));


    }

    static boolean  executeTests(int commitId){
        if (commitId >= 1 && commitId < 10) {
            return true;
        }
        return false;

    }

    public static int findBadCommit(int[] commitIds) {
        // enclose the code between try and catch block to check if the
        // Arrays are not null, if they are null it will return 0 and print a message in the console.
        try {
            // if the length of the commitIds is == 0 it will print out a message and return -1
            if (commitIds.length == 0) {
                System.out.println("The commitsIds is empty");
                return -1;
            }
            // looping though the array and if one of the commits is false, it will return the id, otherwise it will end up the loop
            // and return 1 as code successful code
            for (int id : commitIds) {
                if (!executeTests(id)) {
                    return id;
                }
            }

        } catch(NullPointerException e){
            System.out.println("The commitIds is null");
            return -1;
        }

        return 1;


    }
}
