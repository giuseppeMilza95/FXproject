package com.example;

public class Dog extends Animals{
    private String name;


    @Override
    public void printName() {
        System.out.println("I am a dog and my name is: " + name);
    }
}
