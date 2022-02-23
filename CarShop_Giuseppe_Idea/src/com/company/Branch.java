package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialAmount) {

        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer findCustomer = findCustomer(customerName);
        if (findCustomer !=null){
            findCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customerChecked = this.customers.get(i);
            if (customerChecked.getName().equals(customerName)) {
                return customerChecked;

            }
        }
        return null;
    }
}
