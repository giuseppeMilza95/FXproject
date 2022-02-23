package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3;



/*        Animal dog = new Animal(); // Object - animal is a class
        //dog.weigth = 3.0;
        dog.species = "Canis";
        dog.name = "Szarik";


        dog.feed(2.0);

        String text = dog.returnSpeciesAndName();
        System.out.println(text);
        text += "afewfawfawe";
        System.out.println(text);

        String nameAndOwner = dog.returnSpeciesAndOwner("Kacper");
        System.out.println(nameAndOwner);

        Human me = new Human();

        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;
        me.phone = new Phone(); // create object without specific name
        //same:
        // Phone iphone = new Phone();
        // me.phone = iphone;

        me.phone.producer = "apple";
        me.phone.model = "6S";


        System.out.println(me.firstName);
        System.out.println(me.pet.name);


        // data type
        int i;
        long l;
        char c;
        boolean b;
        float f;
        double d;
        byte bb;

        Integer ii;
        Long ll;
        Boolean bbb;
        Character cc;
        Float ff;
        Double dd;
        Byte bbbb;

        int aaa = 1; // here we cannot use methods because it is not an object
        Integer aa = 1; // is equal to Integer aa = new Integer(1); here we can use method*/




//        dog.species = "canis";
//        dog.weigth = 10.0;
//        dog.name = "Szarik";
//
//
//        Animal elephant = new Animal(); // Object
//
//        Phone iphone = new Phone();
//
//        iphone.producer = "apple";
//        iphone.model = "6s";
//        iphone.screenSize = 4.0;
//        iphone.os = "iOS";
//
//        Phone onePlus = new Phone();
//        onePlus.producer = "ONEPLUSS";
//        onePlus.model = "8 PRO";
//        onePlus.screenSize = 5.0;
//        onePlus.os = "Android";

        Human me = new Human(1000.0);
        me.phone = new Phone("onePlus", "8Pro", 2.3, "Android");
        System.out.println(me.phone.model);

        me.phone = new Phone ("onePlus", "8Pro", 2.3, "Android");
        System.out.println(me.phone.model);

        Phone ciao = me.phone = new Phone("onePlus", "8Pro", 2.3, "Android");

        System.out.println(Math.PI);
        Double mySalary = me.getSalary();
        me.setSalary(100.5);
        me.feed(1.0);

        Cars fiat = new Cars();
        


    }
}
