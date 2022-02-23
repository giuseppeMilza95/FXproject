package org.example;

import org.springframework.stereotype.Component;

@Component
public class EightCylinders implements Engine{
    private String eightCylinder = "8";


    @Override
    public String engineCylinder() {
        return this.eightCylinder;
    }
}
