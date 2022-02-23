package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        File file = new File("/Users/giuseppetumminello/Desktop/Java Udemu Course/javaExerciseOOP/Giuseppe.txt");
        Scanner scanner = new Scanner(file);
        String fileContent = "";

        while(scanner.hasNextLine())
        System.out.println(scanner.nextLine());
    }
}
