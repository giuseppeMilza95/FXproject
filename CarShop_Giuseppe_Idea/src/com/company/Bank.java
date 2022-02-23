package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }



    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < this.branches.size(); i++){
            Branch existingBranch = this.branches.get(i);
            if (existingBranch.getName().equals(branchName)){
                return existingBranch;
            }
        }
        return null;

    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch existingCustomer = findBranch(branchName);
        if (existingCustomer != null){
            return existingCustomer.newCustomer(customerName, initialTransaction);

        }
        return false;
    }

    public boolean addCustomerTransactions(String branchName, String customerName, double amount){
        Branch existingCustomer = findBranch(branchName);
        if (existingCustomer != null){
            return existingCustomer.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


}
