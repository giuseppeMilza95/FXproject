package com.example;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Student giuseppe = new Student(73.5, 182, "Zenek", 2, 5);
        ArrayList<Person> studentList = new ArrayList<>();
        Student giovanni = new Student(92., 189, "Bravo", 3, 2);

        studentList.add(giuseppe);
        studentList.add(giovanni);

        /**The sort method can be used using the lamda expression to simplify, it will sort in ascending order **/



        Collections.sort(studentList,
                (o1, o2) -> o1.getName().compareTo(o2.getName()));



        for(Person name : studentList){
            System.out.println("Result: " + name.toString());


    }


    }


}

