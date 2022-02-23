package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Motorbike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("I am driving a bike");
    }
}
