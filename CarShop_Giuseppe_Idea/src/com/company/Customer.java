package com.company;

import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Double> transaction;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transaction = new ArrayList <Double>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transaction;
    }

    public void addTransaction(double amount){
        this.transaction.add(amount);
    }
}
