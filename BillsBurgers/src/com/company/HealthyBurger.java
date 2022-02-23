package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void AddHealthyAddition1(String name, double price) {
        this.healthyExtra1Price = price;
        this.healthyExtra1Name = name;

    }

    public void AddHealthyAddition2(String name, double price) {
        this.healthyExtra1Price = price;
        this.healthyExtra1Name = name;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
