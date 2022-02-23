package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private Double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1price;
    private String addition2Name;
    private double addition2price;
    private String addition3Name;
    private double addition3price;
    private String addition4Name;
    private double addition4price;


    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1price += price;
        this.addition1Name = name;

    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2price += price;
        this.addition2Name = name;

    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3price += price;
        this.addition3Name = name;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4price += price;
        this.addition4Name = name;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll " + " with " + this.meat + ", price is " + this.price);
        if(this.addition1Name != null){
            hamburgerPrice += this.addition1price;
            System.out.println("Added " + this.addition1Name + " for and extra " + this.addition1price);
        }
        if(this.addition2Name != null){
            hamburgerPrice += this.addition2price;
            System.out.println("Added " + this.addition2Name + " for and extra " + this.addition2price);
        }
        if(this.addition3Name != null){
            hamburgerPrice += this.addition3price;
            System.out.println("Added " + this.addition3Name + " for and extra " + this.addition3price);
        }
        if(this.addition4Name != null){
            hamburgerPrice += this.addition4price;
            System.out.println("Added " + this.addition4Name + " for and extra " + this.addition4price);
        }

        return hamburgerPrice;

    }
}
