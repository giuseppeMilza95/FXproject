package com.example;

public class Main {

    public static void main(String[] args) {
//        MultiThread multiThread = new MultiThread();
//        MultiThread secondThread = new MultiThread();
//        MultiThread thirdThread = new MultiThread();
//        Thread myThread = new Thread(multiThread);
//        myThread.start();


        Vehicle car = new Car();
        car.wheels();
        Vehicle motorbike = new MotorBike();
        motorbike.wheels();

    }
}
