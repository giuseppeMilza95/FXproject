package com.company;

public class Car extends Device{


    public Car(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "Car" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\''
                ;
    }
}
