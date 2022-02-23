package com.company;

public class Car
{


    public String Make;
    public String Model;
    public Double Value;
    public String Engine;

    public Car(String model, String make, double value, String engine) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Value=" + Value +
                ", Engine='" + Engine + '\'' +
                '}';
    }
}

