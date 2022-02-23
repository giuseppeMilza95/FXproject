package com.company;

public class Human {
    public String FirstName;
    public String LastName;
    public int Number;
    private Car car;
    private Double salary;




    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public Car setCar(String model, String make, double value, String engine) {
        this.car.Model = model;
        this.car.Make = make;
        this.car.Value = value;
        this.car.Engine = engine;

        return new Car(model,make,value,engine);
    }

    @Override
    public String toString() {
        return "Human{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Number=" + Number +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
