package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class DeluxeBurger extends Hamburger{
    private Hamburger hamburger;

    public DeluxeBurger (){
        super("Deluxe","Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}


