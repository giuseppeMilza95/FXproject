package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car bmw = context.getBean(Car.class);
        Motorbike motorbike  = context.getBean(Motorbike.class);
        bmw.drive();
        motorbike.drive();
        bmw.drive();

    }
}
