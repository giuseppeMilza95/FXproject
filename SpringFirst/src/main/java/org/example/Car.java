package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Car implements Vehicle{
    @Autowired
    @Qualifier("sixCylinder")
    private Engine engine;




    @Override
    public void drive() {
        System.out.println("I am driving a car");
        System.out.println("The number of the cylinders are: " + engine.engineCylinder());

    }
}
