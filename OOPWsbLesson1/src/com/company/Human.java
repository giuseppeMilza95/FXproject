package com.company;

public class Human extends Animal{
    String firstName;
    String lastName;
    Phone phone;
    Animal pet; // the type of
    int number;
    private double salary;

    Human(Double salary){
        this.salary = salary;
        if (salary != null){
            this.salary = salary;
        }
        else{
            this.salary = 0.0;
        }
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
}
