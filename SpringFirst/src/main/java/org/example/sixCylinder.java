package org.example;


import org.springframework.stereotype.Component;

@Component
public class sixCylinder implements Engine{

    private String sixCylinder = "6";


    @Override
    public String engineCylinder() {
        return this.sixCylinder;
    }
}
