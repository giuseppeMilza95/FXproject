package com.example;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING =1;
    public static final int SAVINGS =2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountOfType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountOfType;



    }

    //The branch argument is true if the customer is performing the transaction
    //at branch, with a teller
    //It is false if the customer performung the transaction ar an ATM
    public double deposit(double amount, boolean branch){
        balance+=amount;
        return balance;
    }

    public  double withdraw (double amount, boolean branch){
        if ((amount > 500.00) && !branch){
            throw new IllegalArgumentException();
        }
        balance-=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return  accountType ==CHECKING;
    }





    // More methods that use firstName, lastName. and perform other function
}
