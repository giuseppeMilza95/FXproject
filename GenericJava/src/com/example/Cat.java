package com.example;

public class Cat extends Animals{
    public String name;
    @Override
    public void printName() {
        System.out.println("I am a cat and my name is: " + name);

    }
}
