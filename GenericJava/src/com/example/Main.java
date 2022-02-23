package com.example;

import com.example.Computer.Computer;

import javax.print.attribute.standard.PrinterURI;

public class Main {

    public static void main(String[] args) {
        Print<Cat> printDouble = new Print<Cat>();
        Cat cat = new Cat();
        cat.name = "Bro";
        Computer compute = new Computer();

        printDouble.printValue(printDouble.printValue(new Cat().toString()));


    }
}
