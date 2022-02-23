package com.example;


public class Vehicle {

    public void wheels() {
        return;
    }
}

class Car extends Vehicle{

    @Override
    public void wheels() {
        System.out.println("The car has for wheels");
    }
}


class MotorBike extends Vehicle{
    @Override
    public void wheels() {

        System.out.println("The motorbike has two wheels");
    }
}
