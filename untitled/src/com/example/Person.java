package com.example;

public class Person {
    public double weight;
    public double height;
    public String name;

    public Person(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }



}


