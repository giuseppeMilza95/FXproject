package com.company;

class Car {
    private int cylinders;
    private String name;
    private int wheel;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.wheel = 4;
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }



    public String startEngine() {

        return "car -> startEngine()";

    }

    public String accelerate() {
        return "car -> accelerate()";
    }

    public String brake() {
        return "car -> brake()";
    }


}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // you can get the name of a class using + getClass().getSimpleName()
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // you can get the name of a class using + getClass().getSimpleName()
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // you can get the name of a class using + getClass().getSimpleName()
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Bmw extends Car {
    public Bmw(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // you can get the name of a class using + getClass().getSimpleName()
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "458");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander vrx 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden holden = new Holden(6, "holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Ford ford = new Ford(6, "Falcom");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


    }

}