package com.company;

public class Printer {
    private int tonerAmount = 0;
    private int pages;
    private boolean duplexPrinter;

    public Printer(int pages, boolean duplexPrinter) {

        if (this.tonerAmount <= 100) {
            this.tonerAmount = 100;
        } else{
            this.tonerAmount = -1;
        }


        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerLevel) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerAmount + tonerAmount > 100){
                return -1;
            }
            this.tonerAmount
        } else {
            return -1;
        }

    }

    public void print(int pages) {

            for (int j = 1; j <= pages; j++) {
                if(duplexPrinter) {
                    System.out.println("Pages " + j + " printed");
                }

            }
        }





    }

