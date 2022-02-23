package com.company;

public class Main {

    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6); //  create outer class
        Gearbox.Gear first = mclaren.new Gear(1, 12.3); //for inner class we reference the outer class . inner class and name of the object . new and name of the inner class

        System.out.println(first.driveSpeed(1000));


    }
}
